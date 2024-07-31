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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;
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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
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
import org.telegram.ui.DialogsActivity;
public class SaveToGallerySettingsActivity extends BaseFragment {
    Adapter adapter;
    SaveToGallerySettingsHelper.DialogException dialogException;
    long dialogId;
    LongSparseArray<SaveToGallerySettingsHelper.DialogException> exceptionsDialogs;
    boolean isNewException;
    ArrayList<Item> items;
    RecyclerListView recyclerListView;
    int savePhotosRow;
    int saveVideosRow;
    int type;
    int videoDividerRow;

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.items = new ArrayList<>();
        this.exceptionsDialogs = new LongSparseArray<>();
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
    public View createView(Context context) {
        int i;
        String str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    SaveToGallerySettingsActivity.this.finishFragment();
                }
            }
        });
        if (this.dialogException != null) {
            if (this.isNewException) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
            }
        } else {
            int i2 = this.type;
            if (i2 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i2 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        }
        this.recyclerListView = new RecyclerListView(context);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(400L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerListView recyclerListView = this.recyclerListView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i3) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i3);
            }

            @Override
            public void onDoubleTap(View view, int i3, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i3, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i3, float f, float f2) {
                SaveToGallerySettingsActivity.this.lambda$createView$2(view, i3, f, f2);
            }
        });
        this.recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListenerExtended() {
            @Override
            public final boolean onItemClick(View view, int i3, float f, float f2) {
                boolean lambda$createView$5;
                lambda$createView$5 = SaveToGallerySettingsActivity.this.lambda$createView$5(view, i3, f, f2);
                return lambda$createView$5;
            }

            @Override
            public void onLongClickRelease() {
                RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onLongClickRelease(this);
            }

            @Override
            public void onMove(float f, float f2) {
                RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onMove(this, f, f2);
            }
        });
        frameLayout.addView(this.recyclerListView);
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        if (this.dialogException != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            frameLayout2.setBackground(Theme.AdaptiveRipple.filledRectByKey(Theme.key_featuredStickers_addButton, 8.0f));
            TextView textView = new TextView(getContext());
            textView.setTextSize(1, 14.0f);
            if (this.isNewException) {
                i = R.string.AddException;
                str = "AddException";
            } else {
                i = R.string.SaveException;
                str = "SaveException";
            }
            textView.setText(LocaleController.getString(str, i));
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
            frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2, 17));
            frameLayout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SaveToGallerySettingsActivity.this.lambda$createView$6(view);
                }
            });
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        updateRows();
        return this.fragmentView;
    }

    public void lambda$createView$2(View view, int i, float f, float f2) {
        if (i == this.savePhotosRow) {
            SaveToGallerySettingsHelper.Settings settings = getSettings();
            settings.savePhoto = !settings.savePhoto;
            onSettingsUpdated();
            updateRows();
        } else if (i == this.saveVideosRow) {
            SaveToGallerySettingsHelper.Settings settings2 = getSettings();
            settings2.saveVideo = !settings2.saveVideo;
            onSettingsUpdated();
            updateRows();
        } else if (this.items.get(i).viewType == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i2 = this.type;
            if (i2 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i2 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
                @Override
                public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
                    boolean lambda$createView$0;
                    lambda$createView$0 = SaveToGallerySettingsActivity.this.lambda$createView$0(dialogsActivity2, arrayList, charSequence, z, topicsFragment);
                    return lambda$createView$0;
                }
            });
            presentFragment(dialogsActivity);
        } else if (this.items.get(i).viewType == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", this.items.get(i).exception.dialogId);
            bundle2.putInt("type", this.type);
            presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (this.items.get(i).viewType == 4) {
            AlertDialog create = AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString("NotificationsDeleteAllExceptionTitle", R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString("NotificationsDeleteAllExceptionAlert", R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString("Delete", R.string.Delete), new Runnable() {
                @Override
                public final void run() {
                    SaveToGallerySettingsActivity.this.lambda$createView$1();
                }
            }, null).create();
            create.show();
            create.redPositive();
        }
    }

    public boolean lambda$createView$0(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
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

    public boolean lambda$createView$5(View view, final int i, float f, float f2) {
        if (this.items.get(i).viewType == 2) {
            final SaveToGallerySettingsHelper.DialogException dialogException = this.items.get(i).exception;
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext());
            ActionBarMenuSubItem addItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString("EditException", R.string.EditException), false, null);
            ActionBarMenuSubItem addItem2 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString("DeleteException", R.string.DeleteException), false, null);
            int i2 = Theme.key_text_RedRegular;
            addItem2.setColors(Theme.getColor(i2), Theme.getColor(i2));
            final ActionBarPopupWindow createSimplePopup = AlertsCreator.createSimplePopup(this, actionBarPopupWindowLayout, view, f, f2);
            actionBarPopupWindowLayout.setParentWindow(createSimplePopup);
            addItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    SaveToGallerySettingsActivity.this.lambda$createView$3(createSimplePopup, i, view2);
                }
            });
            addItem2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    SaveToGallerySettingsActivity.this.lambda$createView$4(createSimplePopup, dialogException, view2);
                }
            });
            return true;
        }
        return false;
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

    public void lambda$createView$6(View view) {
        if (this.isNewException) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.type);
            SaveToGallerySettingsHelper.DialogException dialogException = this.dialogException;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.type, saveGalleryExceptions);
        }
        finishFragment();
    }

    private void updateRows() {
        ArrayList<? extends AdapterWithDiffUtils.Item> arrayList;
        String string;
        int i = 0;
        if ((this.isPaused || this.adapter == null) ? false : true) {
            arrayList = new ArrayList<>();
            arrayList.addAll(this.items);
        } else {
            arrayList = null;
        }
        this.items.clear();
        if (this.dialogException != null) {
            this.items.add(new Item(9));
            this.items.add(new Item(3));
        }
        this.items.add(new Item(5, LocaleController.getString("SaveToGallery", R.string.SaveToGallery)));
        this.savePhotosRow = this.items.size();
        this.items.add(new Item(6));
        this.saveVideosRow = this.items.size();
        this.items.add(new Item(6));
        if (this.dialogException != null) {
            string = LocaleController.getString("SaveToGalleryHintCurrent", R.string.SaveToGalleryHintCurrent);
        } else {
            int i2 = this.type;
            if (i2 == 1) {
                string = LocaleController.getString("SaveToGalleryHintUser", R.string.SaveToGalleryHintUser);
            } else if (i2 == 4) {
                string = LocaleController.getString("SaveToGalleryHintChannels", R.string.SaveToGalleryHintChannels);
            } else {
                string = i2 == 2 ? LocaleController.getString("SaveToGalleryHintGroup", R.string.SaveToGalleryHintGroup) : null;
            }
        }
        this.items.add(new Item(7, string));
        if (getSettings().saveVideo) {
            this.items.add(new Item(5, LocaleController.getString("MaxVideoSize", R.string.MaxVideoSize)));
            this.items.add(new Item(8));
            this.videoDividerRow = this.items.size();
            this.items.add(new Item(7));
        } else {
            this.videoDividerRow = -1;
        }
        if (this.dialogException == null) {
            this.exceptionsDialogs = getUserConfig().getSaveGalleryExceptions(this.type);
            this.items.add(new Item(1));
            boolean z = false;
            while (i < this.exceptionsDialogs.size()) {
                this.items.add(new Item(2, this.exceptionsDialogs.valueAt(i)));
                i++;
                z = true;
            }
            if (z) {
                this.items.add(new Item(3));
                this.items.add(new Item(4));
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

    public class Adapter extends AdapterWithDiffUtils {
        private Adapter() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            UserCell2 userCell2;
            ShadowSectionCell shadowSectionCell = null;
            switch (i) {
                case 1:
                    TextCell textCell = new TextCell(viewGroup.getContext());
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException), R.drawable.msg_contact_add, true);
                    textCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    textCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = textCell;
                    break;
                case 2:
                    UserCell userCell = new UserCell(viewGroup.getContext(), 4, 0, false, false);
                    userCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = userCell;
                    break;
                case 3:
                    shadowSectionCell = new ShadowSectionCell(viewGroup.getContext());
                    break;
                case 4:
                    TextCell textCell2 = new TextCell(viewGroup.getContext());
                    textCell2.setText(LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException), false);
                    textCell2.setColors(-1, Theme.key_text_RedRegular);
                    textCell2.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = textCell2;
                    break;
                case 5:
                    HeaderCell headerCell = new HeaderCell(viewGroup.getContext());
                    headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = headerCell;
                    break;
                case 6:
                    TextCheckCell textCheckCell = new TextCheckCell(viewGroup.getContext());
                    textCheckCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = textCheckCell;
                    break;
                case 7:
                    shadowSectionCell = new TextInfoPrivacyCell(viewGroup.getContext());
                    break;
                case 8:
                    LinearLayout linearLayout = new LinearLayout(SaveToGallerySettingsActivity.this.getContext());
                    linearLayout.setOrientation(1);
                    final SeekBarView seekBarView = new SeekBarView(SaveToGallerySettingsActivity.this.getContext());
                    FrameLayout frameLayout = new FrameLayout(SaveToGallerySettingsActivity.this.getContext());
                    SaveToGallerySettingsActivity saveToGallerySettingsActivity = SaveToGallerySettingsActivity.this;
                    final SelectableAnimatedTextView selectableAnimatedTextView = new SelectableAnimatedTextView(saveToGallerySettingsActivity.getContext());
                    selectableAnimatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
                    selectableAnimatedTextView.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                    frameLayout.addView(selectableAnimatedTextView, LayoutHelper.createFrame(-2, -2, 83));
                    SaveToGallerySettingsActivity saveToGallerySettingsActivity2 = SaveToGallerySettingsActivity.this;
                    final SelectableAnimatedTextView selectableAnimatedTextView2 = new SelectableAnimatedTextView(saveToGallerySettingsActivity2.getContext());
                    selectableAnimatedTextView2.setTextSize(AndroidUtilities.dp(13.0f));
                    frameLayout.addView(selectableAnimatedTextView2, LayoutHelper.createFrame(-2, -2, 81));
                    SaveToGallerySettingsActivity saveToGallerySettingsActivity3 = SaveToGallerySettingsActivity.this;
                    final SelectableAnimatedTextView selectableAnimatedTextView3 = new SelectableAnimatedTextView(saveToGallerySettingsActivity3.getContext());
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
                        public CharSequence getContentDescription() {
                            return SeekBarView.SeekBarViewDelegate.CC.$default$getContentDescription(this);
                        }

                        @Override
                        public int getStepsCount() {
                            return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
                        }

                        @Override
                        public void onSeekBarPressed(boolean z) {
                        }

                        @Override
                        public void onSeekBarDrag(boolean z, float f) {
                            boolean isAttachedToWindow = seekBarView.isAttachedToWindow();
                            long j3 = f > 0.7f ? ((float) 104857600) + (((float) 4089446400L) * ((f - 0.7f) / 0.3f)) : (((float) 104333312) * (f / 0.7f)) + 524288.0f;
                            if (f >= 1.0f) {
                                selectableAnimatedTextView.setSelectedInternal(false, isAttachedToWindow);
                                selectableAnimatedTextView2.setSelectedInternal(false, isAttachedToWindow);
                                selectableAnimatedTextView3.setSelectedInternal(true, isAttachedToWindow);
                                AndroidUtilities.updateViewVisibilityAnimated(selectableAnimatedTextView2, false, 0.8f, isAttachedToWindow);
                            } else if (f == 0.0f) {
                                selectableAnimatedTextView.setSelectedInternal(true, isAttachedToWindow);
                                selectableAnimatedTextView2.setSelectedInternal(false, isAttachedToWindow);
                                selectableAnimatedTextView3.setSelectedInternal(false, isAttachedToWindow);
                                AndroidUtilities.updateViewVisibilityAnimated(selectableAnimatedTextView2, false, 0.8f, isAttachedToWindow);
                            } else {
                                selectableAnimatedTextView2.setText(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false);
                                selectableAnimatedTextView.setSelectedInternal(false, isAttachedToWindow);
                                selectableAnimatedTextView2.setSelectedInternal(true, isAttachedToWindow);
                                selectableAnimatedTextView3.setSelectedInternal(false, isAttachedToWindow);
                                AndroidUtilities.updateViewVisibilityAnimated(selectableAnimatedTextView2, true, 0.8f, isAttachedToWindow);
                            }
                            if (z) {
                                SaveToGallerySettingsActivity.this.getSettings().limitVideo = j3;
                                SaveToGallerySettingsActivity.this.onSettingsUpdated();
                            }
                        }
                    });
                    seekBarView.setProgress(((float) j) > ((float) 104857600) * 0.7f ? (0.3f * (((float) (j - 104857600)) / ((float) 4089446400L))) + 0.7f : (((float) (j - 524288)) / ((float) 104333312)) * 0.7f);
                    seekBarView.delegate.onSeekBarDrag(false, seekBarView.getProgress());
                    userCell2 = linearLayout;
                    userCell2.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = userCell2;
                    break;
                case 9:
                    userCell2 = new UserCell2(SaveToGallerySettingsActivity.this.getContext(), 4, 0, SaveToGallerySettingsActivity.this.getResourceProvider());
                    userCell2.setData(DialogObject.isUserDialog(SaveToGallerySettingsActivity.this.dialogId) ? MessagesController.getInstance(((BaseFragment) SaveToGallerySettingsActivity.this).currentAccount).getUser(Long.valueOf(SaveToGallerySettingsActivity.this.dialogId)) : MessagesController.getInstance(((BaseFragment) SaveToGallerySettingsActivity.this).currentAccount).getChat(Long.valueOf(-SaveToGallerySettingsActivity.this.dialogId)), null, null, 0);
                    userCell2.setBackgroundColor(SaveToGallerySettingsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = userCell2;
                    break;
                case 10:
                    ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(viewGroup.getContext());
                    shadowSectionCell2.setBackgroundDrawable(Theme.getThemedDrawable(SaveToGallerySettingsActivity.this.getContext(), R.drawable.greydivider_bottom, Theme.getColor(Theme.key_windowBackgroundGrayShadow, SaveToGallerySettingsActivity.this.getResourceProvider())));
                    shadowSectionCell = shadowSectionCell2;
                    break;
            }
            shadowSectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(shadowSectionCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (SaveToGallerySettingsActivity.this.items.get(i).viewType == 1) {
                ((TextCell) viewHolder.itemView).setNeedDivider(SaveToGallerySettingsActivity.this.exceptionsDialogs.size() > 0);
            } else if (SaveToGallerySettingsActivity.this.items.get(i).viewType == 6) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                SaveToGallerySettingsHelper.Settings settings = SaveToGallerySettingsActivity.this.getSettings();
                if (i == SaveToGallerySettingsActivity.this.savePhotosRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.SaveToGalleryPhotos), settings.savePhoto, true);
                    textCheckCell.setColorfullIcon(SaveToGallerySettingsActivity.this.getThemedColor(Theme.key_statisticChartLine_lightblue), R.drawable.msg_filled_data_photos);
                    return;
                }
                textCheckCell.setTextAndCheck(LocaleController.getString(R.string.SaveToGalleryVideos), settings.saveVideo, false);
                textCheckCell.setColorfullIcon(SaveToGallerySettingsActivity.this.getThemedColor(Theme.key_statisticChartLine_green), R.drawable.msg_filled_data_videos);
            } else if (SaveToGallerySettingsActivity.this.items.get(i).viewType == 7) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = SaveToGallerySettingsActivity.this;
                if (i == saveToGallerySettingsActivity.videoDividerRow) {
                    long j = saveToGallerySettingsActivity.getSettings().limitVideo;
                    SaveToGallerySettingsActivity saveToGallerySettingsActivity2 = SaveToGallerySettingsActivity.this;
                    if (saveToGallerySettingsActivity2.dialogException != null) {
                        textInfoPrivacyCell.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
                        return;
                    }
                    int i2 = saveToGallerySettingsActivity2.type;
                    if (i2 == 1) {
                        textInfoPrivacyCell.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
                        return;
                    } else if (i2 == 4) {
                        textInfoPrivacyCell.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
                        return;
                    } else if (i2 == 2) {
                        textInfoPrivacyCell.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
                        return;
                    } else {
                        return;
                    }
                }
                textInfoPrivacyCell.setText(saveToGallerySettingsActivity.items.get(i).title);
            } else if (SaveToGallerySettingsActivity.this.items.get(i).viewType == 5) {
                ((HeaderCell) viewHolder.itemView).setText(SaveToGallerySettingsActivity.this.items.get(i).title);
            } else if (SaveToGallerySettingsActivity.this.items.get(i).viewType == 2) {
                UserCell userCell = (UserCell) viewHolder.itemView;
                SaveToGallerySettingsHelper.DialogException dialogException = SaveToGallerySettingsActivity.this.items.get(i).exception;
                TLObject userOrChat = SaveToGallerySettingsActivity.this.getMessagesController().getUserOrChat(dialogException.dialogId);
                String str = null;
                if (userOrChat instanceof TLRPC$User) {
                    TLRPC$User tLRPC$User = (TLRPC$User) userOrChat;
                    if (tLRPC$User.self) {
                        str = LocaleController.getString("SavedMessages", R.string.SavedMessages);
                    } else {
                        str = ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name);
                    }
                } else if (userOrChat instanceof TLRPC$Chat) {
                    str = ((TLRPC$Chat) userOrChat).title;
                }
                String str2 = str;
                userCell.setSelfAsSavedMessages(true);
                userCell.setData(userOrChat, str2, dialogException.createDescription(((BaseFragment) SaveToGallerySettingsActivity.this).currentAccount), 0, i == SaveToGallerySettingsActivity.this.items.size() - 1 || SaveToGallerySettingsActivity.this.items.get(i + 1).viewType == 2);
            }
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
    }

    public class Item extends AdapterWithDiffUtils.Item {
        final SaveToGallerySettingsHelper.DialogException exception;
        String title;

        private Item(SaveToGallerySettingsActivity saveToGallerySettingsActivity, int i) {
            super(i, false);
            this.exception = null;
        }

        private Item(SaveToGallerySettingsActivity saveToGallerySettingsActivity, int i, SaveToGallerySettingsHelper.DialogException dialogException) {
            super(i, false);
            this.exception = dialogException;
        }

        private Item(SaveToGallerySettingsActivity saveToGallerySettingsActivity, int i, String str) {
            super(i, false);
            this.title = str;
            this.exception = null;
        }

        public boolean equals(Object obj) {
            SaveToGallerySettingsHelper.DialogException dialogException;
            if (this == obj) {
                return true;
            }
            if (obj == null || Item.class != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            if (this.viewType != item.viewType) {
                return false;
            }
            String str = this.title;
            if (str != null) {
                return Objects.equals(str, item.title);
            }
            SaveToGallerySettingsHelper.DialogException dialogException2 = this.exception;
            return dialogException2 == null || (dialogException = item.exception) == null || dialogException2.dialogId == dialogException.dialogId;
        }
    }

    SaveToGallerySettingsHelper.Settings getSettings() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.dialogException;
        return dialogException != null ? dialogException : SaveToGallerySettingsHelper.getSettings(this.type);
    }

    @Override
    public void onResume() {
        super.onResume();
        updateRows();
    }

    public void onSettingsUpdated() {
        if (this.isNewException) {
            return;
        }
        if (this.dialogException != null) {
            LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = getUserConfig().getSaveGalleryExceptions(this.type);
            SaveToGallerySettingsHelper.DialogException dialogException = this.dialogException;
            saveGalleryExceptions.put(dialogException.dialogId, dialogException);
            getUserConfig().updateSaveGalleryExceptions(this.type, saveGalleryExceptions);
            return;
        }
        SaveToGallerySettingsHelper.saveSettings(this.type);
    }

    private class SelectableAnimatedTextView extends AnimatedTextView {
        AnimatedFloat progressToSelect;
        boolean selected;

        public SelectableAnimatedTextView(Context context) {
            super(context, true, true, false);
            this.progressToSelect = new AnimatedFloat(this);
            getDrawable().setAllowCancel(true);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            this.progressToSelect.set(this.selected ? 1.0f : 0.0f);
            setTextColor(ColorUtils.blendARGB(SaveToGallerySettingsActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText), SaveToGallerySettingsActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText), this.progressToSelect.get()));
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
}
