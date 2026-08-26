package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SeekBarView;

public class SaveToGallerySettingsActivity extends BaseFragment {
    private static final int VIEW_TYPE_USER_INFO = 9;
    private final int VIEW_TYPE_ADD_EXCEPTION;
    private final int VIEW_TYPE_CHAT;
    private final int VIEW_TYPE_CHOOSER;
    private final int VIEW_TYPE_DELETE_ALL;
    private final int VIEW_TYPE_DIVIDER;
    private final int VIEW_TYPE_DIVIDER_INFO;
    private final int VIEW_TYPE_DIVIDER_LAST;
    private final int VIEW_TYPE_HEADER;
    private final int VIEW_TYPE_TOGGLE;
    Adapter adapter;
    public int addExceptionRow;
    public int deleteAllExceptionsRow;
    SaveToGallerySettingsHelper.DialogException dialogException;
    long dialogId;
    LongSparseArray<SaveToGallerySettingsHelper.DialogException> exceptionsDialogs;
    boolean isNewException;
    ArrayList<Item> items;
    public int maxVideoSizeRow;
    RecyclerListView recyclerListView;
    int savePhotosRow;
    int saveVideosRow;
    int type;
    int videoDividerRow;

    public class Adapter extends AdapterWithDiffUtils {
        private Adapter() {
        }

        @Override
        public int getItemCount() {
            return SaveToGallerySettingsActivity.this.items.size();
        }

        @Override
        public int getItemViewType(int i) {
            return SaveToGallerySettingsActivity.this.items.get(i).viewType;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 2 || viewHolder.getItemViewType() == 4 || viewHolder.getItemViewType() == 6;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            if (SaveToGallerySettingsActivity.this.items.get(i).viewType == 1) {
                ((TextCell) viewHolder.itemView).setNeedDivider(SaveToGallerySettingsActivity.this.exceptionsDialogs.size() > 0);
                return;
            }
            if (SaveToGallerySettingsActivity.this.items.get(i).viewType == 6) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsActivity.this.getSettings();
                if (i == SaveToGallerySettingsActivity.this.savePhotosRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.SaveToGalleryPhotos), settings.savePhoto, true);
                    textCheckCell.setColorfullIcon(SaveToGallerySettingsActivity.this.getThemedColor(Theme.key_statisticChartLine_lightblue), R.drawable.msg_filled_data_photos);
                    return;
                } else {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.SaveToGalleryVideos), settings.saveVideo, false);
                    textCheckCell.setColorfullIcon(SaveToGallerySettingsActivity.this.getThemedColor(Theme.key_statisticChartLine_green), R.drawable.msg_filled_data_videos);
                    return;
                }
            }
            if (SaveToGallerySettingsActivity.this.items.get(i).viewType != 7) {
                if (SaveToGallerySettingsActivity.this.items.get(i).viewType == 5) {
                    ((HeaderCell) viewHolder.itemView).setText(SaveToGallerySettingsActivity.this.items.get(i).title);
                    return;
                }
                if (SaveToGallerySettingsActivity.this.items.get(i).viewType == 2) {
                    UserCell userCell = (UserCell) viewHolder.itemView;
                    SaveToGallerySettingsHelper.DialogException dialogException = SaveToGallerySettingsActivity.this.items.get(i).exception;
                    TLObject userOrChat = SaveToGallerySettingsActivity.this.getMessagesController().getUserOrChat(dialogException.dialogId);
                    if (userOrChat instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) userOrChat;
                        string = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
                    } else {
                        string = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                    }
                    String str = string;
                    userCell.setSelfAsSavedMessages(true);
                    userCell.setData(userOrChat, str, dialogException.createDescription(((BaseFragment) SaveToGallerySettingsActivity.this).currentAccount), 0, i == SaveToGallerySettingsActivity.this.items.size() - 1 || SaveToGallerySettingsActivity.this.items.get(i + 1).viewType == 2);
                    return;
                }
                return;
            }
            TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
            SaveToGallerySettingsActivity saveToGallerySettingsActivity = SaveToGallerySettingsActivity.this;
            if (i != saveToGallerySettingsActivity.videoDividerRow) {
                textInfoPrivacyCell.setText(saveToGallerySettingsActivity.items.get(i).title);
                return;
            }
            long j = saveToGallerySettingsActivity.getSettings().limitVideo;
            SaveToGallerySettingsActivity saveToGallerySettingsActivity2 = SaveToGallerySettingsActivity.this;
            if (saveToGallerySettingsActivity2.dialogException != null) {
                textInfoPrivacyCell.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
                return;
            }
            int i2 = saveToGallerySettingsActivity2.type;
            if (i2 == 1) {
                textInfoPrivacyCell.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
            } else if (i2 == 4) {
                textInfoPrivacyCell.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
            } else if (i2 == 2) {
                textInfoPrivacyCell.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ?? r9;
            Object shadowSectionCell;
            ?? r8 = 0;
            switch (i) {
                case 1:
                    TextCell textCell = new TextCell(viewGroup.getContext());
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.NotificationsAddAnException), R.drawable.msg_contact_add, true);
                    textCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    textCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    r8 = textCell;
                    break;
                case 2:
                    UserCell userCell = new UserCell(4, 0, viewGroup.getContext(), null, false, false);
                    userCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    r9 = userCell;
                    r8 = r9;
                    break;
                case 3:
                    shadowSectionCell = new ShadowSectionCell(viewGroup.getContext(), null, 0);
                    r8 = shadowSectionCell;
                    break;
                case 4:
                    TextCell textCell2 = new TextCell(viewGroup.getContext());
                    textCell2.setText(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    textCell2.setColors(-1, Theme.key_text_RedRegular);
                    textCell2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    shadowSectionCell = textCell2;
                    r8 = shadowSectionCell;
                    break;
                case 5:
                    HeaderCell headerCell = new HeaderCell(viewGroup.getContext());
                    headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    shadowSectionCell = headerCell;
                    r8 = shadowSectionCell;
                    break;
                case 6:
                    TextCheckCell textCheckCell = new TextCheckCell(viewGroup.getContext());
                    textCheckCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    shadowSectionCell = textCheckCell;
                    r8 = shadowSectionCell;
                    break;
                case 7:
                    shadowSectionCell = new TextInfoPrivacyCell(viewGroup.getContext(), 24, null);
                    r8 = shadowSectionCell;
                    break;
                case 8:
                    ?? linearLayout = new LinearLayout(SaveToGallerySettingsActivity.this.getContext());
                    linearLayout.setOrientation(1);
                    final SeekBarView seekBarView = new SeekBarView(SaveToGallerySettingsActivity.this.getContext());
                    FrameLayout frameLayout = new FrameLayout(SaveToGallerySettingsActivity.this.getContext());
                    SaveToGallerySettingsActivity saveToGallerySettingsActivity = SaveToGallerySettingsActivity.this;
                    final SelectableAnimatedTextView selectableAnimatedTextView = saveToGallerySettingsActivity.new SelectableAnimatedTextView(saveToGallerySettingsActivity.getContext());
                    selectableAnimatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
                    selectableAnimatedTextView.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                    frameLayout.addView(selectableAnimatedTextView, LayoutHelper.createFrame(-2, -2, 83));
                    SaveToGallerySettingsActivity saveToGallerySettingsActivity2 = SaveToGallerySettingsActivity.this;
                    final SelectableAnimatedTextView selectableAnimatedTextView2 = saveToGallerySettingsActivity2.new SelectableAnimatedTextView(saveToGallerySettingsActivity2.getContext());
                    selectableAnimatedTextView2.setTextSize(AndroidUtilities.dp(13.0f));
                    frameLayout.addView(selectableAnimatedTextView2, LayoutHelper.createFrame(-2, -2, 81));
                    SaveToGallerySettingsActivity saveToGallerySettingsActivity3 = SaveToGallerySettingsActivity.this;
                    final SelectableAnimatedTextView selectableAnimatedTextView3 = saveToGallerySettingsActivity3.new SelectableAnimatedTextView(saveToGallerySettingsActivity3.getContext());
                    selectableAnimatedTextView3.setTextSize(AndroidUtilities.dp(13.0f));
                    long j = 4194304000L;
                    selectableAnimatedTextView3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                    frameLayout.addView(selectableAnimatedTextView3, LayoutHelper.createFrame(-2, -2, 85));
                    linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 20, 0, 21, 10, 21, 0));
                    linearLayout.addView(seekBarView, LayoutHelper.createLinear(-1, 38, 0, 5, 0, 5, 4));
                    long j2 = SaveToGallerySettingsActivity.this.getSettings().limitVideo;
                    if (j2 >= 0 && j2 <= 4194304000L) {
                        j = j2;
                    }
                    seekBarView.setReportChanges(true);
                    seekBarView.setDelegate(new SeekBarView.SeekBarViewDelegate() {
                        @Override
                        public final CharSequence getContentDescription() {
                            return SeekBarView.SeekBarViewDelegate.CC.$default$getContentDescription(this);
                        }

                        @Override
                        public final int getStepsCount() {
                            return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
                        }

                        @Override
                        public final boolean needVisuallyDivideSteps() {
                            return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
                        }

                        @Override
                        public void onSeekBarDrag(boolean z, float f) {
                            boolean zIsAttachedToWindow = seekBarView.isAttachedToWindow();
                            long j3 = f > 0.7f ? (long) ((4089446400L * ((f - 0.7f) / 0.3f)) + 104857600) : (long) ((104333312 * (f / 0.7f)) + 524288.0f);
                            if (f >= 1.0f) {
                                selectableAnimatedTextView.setSelectedInternal(false, zIsAttachedToWindow);
                                selectableAnimatedTextView2.setSelectedInternal(false, zIsAttachedToWindow);
                                selectableAnimatedTextView3.setSelectedInternal(true, zIsAttachedToWindow);
                                AndroidUtilities.updateViewVisibilityAnimated(selectableAnimatedTextView2, false, 0.8f, zIsAttachedToWindow);
                            } else if (f == 0.0f) {
                                selectableAnimatedTextView.setSelectedInternal(true, zIsAttachedToWindow);
                                selectableAnimatedTextView2.setSelectedInternal(false, zIsAttachedToWindow);
                                selectableAnimatedTextView3.setSelectedInternal(false, zIsAttachedToWindow);
                                AndroidUtilities.updateViewVisibilityAnimated(selectableAnimatedTextView2, false, 0.8f, zIsAttachedToWindow);
                            } else {
                                selectableAnimatedTextView2.setText(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false);
                                selectableAnimatedTextView.setSelectedInternal(false, zIsAttachedToWindow);
                                selectableAnimatedTextView2.setSelectedInternal(true, zIsAttachedToWindow);
                                selectableAnimatedTextView3.setSelectedInternal(false, zIsAttachedToWindow);
                                AndroidUtilities.updateViewVisibilityAnimated(selectableAnimatedTextView2, true, 0.8f, zIsAttachedToWindow);
                            }
                            if (z) {
                                SaveToGallerySettingsActivity.this.getSettings().limitVideo = j3;
                                SaveToGallerySettingsActivity.this.onSettingsUpdated();
                            }
                        }

                        @Override
                        public void onSeekBarPressed(boolean z) {
                        }
                    });
                    seekBarView.setProgress(((float) j) > ((float) 104857600) * 0.7f ? zzir.m(j - 104857600, 4089446400L, 0.3f, 0.7f) : ((j - 524288) / 104333312) * 0.7f);
                    seekBarView.delegate.onSeekBarDrag(false, seekBarView.getProgress());
                    linearLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    r9 = linearLayout;
                    r8 = r9;
                    break;
                case 9:
                    UserCell2 userCell2 = new UserCell2(SaveToGallerySettingsActivity.this.getContext(), SaveToGallerySettingsActivity.this.getResourceProvider());
                    userCell2.setData(DialogObject.isUserDialog(SaveToGallerySettingsActivity.this.dialogId) ? MessagesController.getInstance(((BaseFragment) SaveToGallerySettingsActivity.this).currentAccount).getUser(Long.valueOf(SaveToGallerySettingsActivity.this.dialogId)) : MessagesController.getInstance(((BaseFragment) SaveToGallerySettingsActivity.this).currentAccount).getChat(Long.valueOf(-SaveToGallerySettingsActivity.this.dialogId)), null);
                    userCell2.setBackgroundColor(SaveToGallerySettingsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = userCell2;
                    r8 = shadowSectionCell;
                    break;
                case 10:
                    ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(viewGroup.getContext(), null, 0);
                    shadowSectionCell2.setBackgroundDrawable(Theme.getThemedDrawable(SaveToGallerySettingsActivity.this.getContext(), R.drawable.greydivider_bottom, Theme.getColor(Theme.key_windowBackgroundGrayShadow, SaveToGallerySettingsActivity.this.getResourceProvider())));
                    shadowSectionCell = shadowSectionCell2;
                    r8 = shadowSectionCell;
                    break;
            }
            return zzkd.m(r8, r8, -2);
        }
    }

    public class SelectableAnimatedTextView extends AnimatedTextView {
        AnimatedFloat progressToSelect;
        boolean selected;

        public SelectableAnimatedTextView(Context context) {
            super(context, true, true, false);
            this.progressToSelect = new AnimatedFloat(this);
            getDrawable().setAllowCancel(true);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            this.progressToSelect.set(this.selected ? 1.0f : 0.0f);
            setTextColor(ColorUtils.blendARGB(this.progressToSelect.get(), SaveToGallerySettingsActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText), SaveToGallerySettingsActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText)));
            super.dispatchDraw(canvas);
        }

        public void setSelectedInternal(boolean z, boolean z2) {
            if (this.selected != z) {
                this.selected = z;
                this.progressToSelect.set(z ? 1.0f : 0.0f, z2);
                invalidate();
            }
        }
    }

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.VIEW_TYPE_ADD_EXCEPTION = 1;
        this.VIEW_TYPE_CHAT = 2;
        this.VIEW_TYPE_DIVIDER = 3;
        this.VIEW_TYPE_DELETE_ALL = 4;
        this.VIEW_TYPE_HEADER = 5;
        this.VIEW_TYPE_TOGGLE = 6;
        this.VIEW_TYPE_DIVIDER_INFO = 7;
        this.VIEW_TYPE_CHOOSER = 8;
        this.VIEW_TYPE_DIVIDER_LAST = 10;
        this.items = new ArrayList<>();
        this.exceptionsDialogs = new LongSparseArray<>();
    }

    public boolean lambda$createView$0(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        bundle.putInt("type", this.type);
        presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    public void lambda$createView$1() {
        this.exceptionsDialogs.clear();
        getUserConfig().updateSaveGalleryExceptions(this.type, this.exceptionsDialogs);
        updateRows();
    }

    public void lambda$createView$2(View view, int i, float f, float f2) {
        if (i == this.savePhotosRow) {
            SaveToGallerySettingsHelper.Settings settings = getSettings();
            settings.savePhoto = !settings.savePhoto;
            onSettingsUpdated();
            updateRows();
            return;
        }
        if (i == this.saveVideosRow) {
            SaveToGallerySettingsHelper.Settings settings2 = getSettings();
            settings2.saveVideo = !settings2.saveVideo;
            onSettingsUpdated();
            updateRows();
            return;
        }
        if (this.items.get(i).viewType != 1) {
            if (this.items.get(i).viewType == 2) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.items.get(i).exception.dialogId);
                bundle.putInt("type", this.type);
                presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            }
            if (this.items.get(i).viewType == 4) {
                AlertDialog alertDialogCreate = AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new MainTabsLayout$$ExternalSyntheticLambda0(this, 22), null).create();
                alertDialogCreate.show();
                alertDialogCreate.redPositive();
                return;
            }
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        int i2 = this.type;
        if (i2 == 2) {
            bundle2.putInt("dialogsType", 6);
        } else if (i2 == 4) {
            bundle2.putInt("dialogsType", 5);
        } else {
            bundle2.putInt("dialogsType", 4);
        }
        bundle2.putBoolean("allowGlobalSearch", false);
        DialogsActivity dialogsActivity = new DialogsActivity(bundle2);
        dialogsActivity.setDelegate(new PhotoViewer$$ExternalSyntheticLambda96(this, 10));
        presentFragment(dialogsActivity);
    }

    public void lambda$createView$3(ActionBarPopupWindow actionBarPopupWindow, int i, View view) {
        actionBarPopupWindow.dismiss();
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.items.get(i).exception.dialogId);
        bundle.putInt("type", this.type);
        presentFragment(new SaveToGallerySettingsActivity(bundle));
    }

    public void lambda$createView$4(ActionBarPopupWindow actionBarPopupWindow, SaveToGallerySettingsHelper.DialogException dialogException, View view) {
        actionBarPopupWindow.dismiss();
        LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.type);
        saveGalleryExceptions.remove(dialogException.dialogId);
        getUserConfig().updateSaveGalleryExceptions(this.type, saveGalleryExceptions);
        updateRows();
    }

    public boolean lambda$createView$5(View view, int i, float f, float f2) {
        if (this.items.get(i).viewType != 2) {
            return false;
        }
        SaveToGallerySettingsHelper.DialogException dialogException = this.items.get(i).exception;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext());
        ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
        int i2 = Theme.key_text_RedRegular;
        actionBarMenuSubItemAddItem2.setColors(Theme.getColor(null, i2, false), Theme.getColor(null, i2, false));
        ActionBarPopupWindow actionBarPopupWindowCreateSimplePopup = AlertsCreator.createSimplePopup(this, actionBarPopupWindowLayout, view, f, f2);
        actionBarPopupWindowLayout.setParentWindow(actionBarPopupWindowCreateSimplePopup);
        actionBarMenuSubItemAddItem.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda1(this, actionBarPopupWindowCreateSimplePopup, i, 8));
        actionBarMenuSubItemAddItem2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda0(this, actionBarPopupWindowCreateSimplePopup, dialogException, 15));
        return true;
    }

    public void lambda$createView$6(View view) {
        if (this.isNewException) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.type);
            SaveToGallerySettingsHelper.DialogException dialogException = this.dialogException;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.type, saveGalleryExceptions);
        }
        finishFragment();
    }

    public void onSettingsUpdated() {
        if (this.isNewException) {
            return;
        }
        if (this.dialogException == null) {
            SaveToGallerySettingsHelper.saveSettings(this.type);
            return;
        }
        LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.type);
        SaveToGallerySettingsHelper.DialogException dialogException = this.dialogException;
        saveGalleryExceptions.put(dialogException.dialogId, dialogException);
        getUserConfig().updateSaveGalleryExceptions(this.type, saveGalleryExceptions);
    }

    private void updateRows() {
        ArrayList<? extends AdapterWithDiffUtils.Item> arrayList;
        String string;
        this.maxVideoSizeRow = -1;
        this.addExceptionRow = -1;
        this.deleteAllExceptionsRow = -1;
        int i = 0;
        int i2 = 1;
        if ((this.isPaused || this.adapter == null) ? false : true) {
            arrayList = new ArrayList<>();
            arrayList.addAll(this.items);
        } else {
            arrayList = null;
        }
        this.items.clear();
        int i3 = 3;
        if (this.dialogException != null) {
            this.items.add(new Item(9));
            this.items.add(new Item(i3));
        }
        int i4 = 5;
        this.items.add(new Item(i4, LocaleController.getString(R.string.SaveToGallery)));
        this.savePhotosRow = this.items.size();
        int i5 = 6;
        this.items.add(new Item(i5));
        this.saveVideosRow = this.items.size();
        this.items.add(new Item(i5));
        int i6 = 2;
        int i7 = 4;
        if (this.dialogException != null) {
            string = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i8 = this.type;
            if (i8 == 1) {
                string = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i8 == 4) {
                string = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else {
                string = i8 == 2 ? LocaleController.getString(R.string.SaveToGalleryHintGroup) : null;
            }
        }
        int i9 = 7;
        this.items.add(new Item(i9, string));
        if (getSettings().saveVideo) {
            this.items.add(new Item(i4, LocaleController.getString(R.string.MaxVideoSize)));
            this.maxVideoSizeRow = this.items.size();
            this.items.add(new Item(8));
            this.videoDividerRow = this.items.size();
            this.items.add(new Item(i9));
        } else {
            this.videoDividerRow = -1;
        }
        if (this.dialogException == null) {
            this.exceptionsDialogs = getUserConfig().getSaveGalleryExceptions(this.type);
            this.addExceptionRow = this.items.size();
            this.items.add(new Item(i2));
            boolean z = false;
            while (i < this.exceptionsDialogs.size()) {
                this.items.add(new Item(i6, this.exceptionsDialogs.valueAt(i)));
                i++;
                z = true;
            }
            if (z) {
                this.items.add(new Item(i3));
                this.deleteAllExceptionsRow = this.items.size();
                this.items.add(new Item(i7));
            }
            this.items.add(new Item(10));
        }
        Adapter adapter = this.adapter;
        if (adapter != null) {
            if (arrayList != null) {
                adapter.setItems(arrayList, this.items);
            } else {
                adapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    public View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        zzki.m(this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    SaveToGallerySettingsActivity.this.finishFragment();
                }
            }
        });
        if (this.dialogException == null) {
            int i = this.type;
            if (i == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        } else if (this.isNewException) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
        }
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.recyclerListView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.recyclerListView);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(400L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        CacheChatsExceptionsFragment$$ExternalSyntheticOutline0.m(1, this.recyclerListView, false);
        RecyclerListView recyclerListView2 = this.recyclerListView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView2.setAdapter(adapter);
        this.recyclerListView.setOnItemClickListener(new SaveToGallerySettingsActivity$$ExternalSyntheticLambda2(this));
        this.recyclerListView.setOnItemLongClickListener(new SaveToGallerySettingsActivity$$ExternalSyntheticLambda2(this));
        frameLayout.addView(this.recyclerListView);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        if (this.dialogException != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            frameLayout2.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{8.0f}, Theme.key_featuredStickers_addButton));
            TextView textView = new TextView(getContext());
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(this.isNewException ? R.string.AddException : R.string.SaveException));
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2, 17));
            frameLayout2.setOnClickListener(new PollItemMenu$$ExternalSyntheticLambda14(this, 7));
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        updateRows();
        return this.fragmentView;
    }

    public SaveToGallerySettingsHelper.Settings getSettings() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.dialogException;
        return dialogException != null ? dialogException : SaveToGallerySettingsHelper.getSettings(this.type);
    }

    @Override
    public boolean onFragmentCreate() {
        this.type = getArguments().getInt("type");
        this.exceptionsDialogs = getUserConfig().getSaveGalleryExceptions(this.type);
        long j = getArguments().getLong("dialog_id");
        this.dialogId = j;
        if (j != 0) {
            SaveToGallerySettingsHelper.DialogException dialogException = UserConfig.getInstance(this.currentAccount).getSaveGalleryExceptions(this.type).get(this.dialogId);
            this.dialogException = dialogException;
            if (dialogException == null) {
                this.isNewException = true;
                this.dialogException = new SaveToGallerySettingsHelper.DialogException();
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsHelper.getSettings(this.type);
                SaveToGallerySettingsHelper.DialogException dialogException2 = this.dialogException;
                dialogException2.savePhoto = settings.savePhoto;
                dialogException2.saveVideo = settings.saveVideo;
                dialogException2.limitVideo = settings.limitVideo;
                dialogException2.dialogId = this.dialogId;
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public void onResume() {
        super.onResume();
        updateRows();
    }

    public class Item extends AdapterWithDiffUtils.Item {
        final SaveToGallerySettingsHelper.DialogException exception;
        String title;

        public boolean equals(Object obj) {
            SaveToGallerySettingsHelper.DialogException dialogException;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            if (this.viewType != item.viewType) {
                return false;
            }
            String str = this.title;
            if (str != null) {
                return str.equals(item.title);
            }
            SaveToGallerySettingsHelper.DialogException dialogException2 = this.exception;
            return dialogException2 == null || (dialogException = item.exception) == null || dialogException2.dialogId == dialogException.dialogId;
        }

        private Item(int i) {
            super(i, false);
            this.exception = null;
        }

        private Item(int i, SaveToGallerySettingsHelper.DialogException dialogException) {
            super(i, false);
            this.exception = dialogException;
        }

        private Item(int i, String str) {
            super(i, false);
            this.title = str;
            this.exception = null;
        }
    }
}
