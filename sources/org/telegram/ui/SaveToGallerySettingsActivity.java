package org.telegram.ui;

import android.app.Activity;
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
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SeekBarView;

public final class SaveToGallerySettingsActivity extends BaseFragment {
    public Adapter adapter;
    public SaveToGallerySettingsHelper.DialogException dialogException;
    public long dialogId;
    public LongSparseArray exceptionsDialogs;
    public boolean isNewException;
    public final ArrayList items;
    public RecyclerListView recyclerListView;
    public int savePhotosRow;
    public int saveVideosRow;
    public int type;
    public int videoDividerRow;

    public final class Adapter extends AdapterWithDiffUtils {
        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            return SaveToGallerySettingsActivity.this.items.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return ((Item) SaveToGallerySettingsActivity.this.items.get(i)).viewType;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 1 || i == 2 || i == 4 || i == 6;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            SaveToGallerySettingsActivity saveToGallerySettingsActivity = SaveToGallerySettingsActivity.this;
            ArrayList arrayList = saveToGallerySettingsActivity.items;
            int i2 = ((Item) arrayList.get(i)).viewType;
            View view = viewHolder.itemView;
            if (i2 == 1) {
                ((TextCell) view).setNeedDivider(saveToGallerySettingsActivity.exceptionsDialogs.size() > 0);
                return;
            }
            if (((Item) arrayList.get(i)).viewType == 6) {
                TextCheckCell textCheckCell = (TextCheckCell) view;
                SaveToGallerySettingsHelper.Settings settings = saveToGallerySettingsActivity.getSettings();
                if (i == saveToGallerySettingsActivity.savePhotosRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.SaveToGalleryPhotos), settings.savePhoto, true);
                    textCheckCell.setColorfullIcon(saveToGallerySettingsActivity.getThemedColor(Theme.key_statisticChartLine_lightblue), R.drawable.msg_filled_data_photos);
                    return;
                } else {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.SaveToGalleryVideos), settings.saveVideo, false);
                    textCheckCell.setColorfullIcon(saveToGallerySettingsActivity.getThemedColor(Theme.key_statisticChartLine_green), R.drawable.msg_filled_data_videos);
                    return;
                }
            }
            if (((Item) arrayList.get(i)).viewType != 7) {
                if (((Item) arrayList.get(i)).viewType == 5) {
                    ((HeaderCell) view).setText(((Item) arrayList.get(i)).title);
                    return;
                }
                if (((Item) arrayList.get(i)).viewType == 2) {
                    UserCell userCell = (UserCell) view;
                    SaveToGallerySettingsHelper.DialogException dialogException = ((Item) arrayList.get(i)).exception;
                    TLObject userOrChat = saveToGallerySettingsActivity.getMessagesController().getUserOrChat(dialogException.dialogId);
                    if (userOrChat instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) userOrChat;
                        string = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
                    } else {
                        string = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                    }
                    userCell.setSelfAsSavedMessages(true);
                    userCell.setData(userOrChat, string, dialogException.createDescription(((BaseFragment) saveToGallerySettingsActivity).currentAccount), i == arrayList.size() - 1 || ((Item) arrayList.get(i + 1)).viewType == 2);
                    return;
                }
                return;
            }
            TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
            if (i != saveToGallerySettingsActivity.videoDividerRow) {
                textInfoPrivacyCell.setText(((Item) arrayList.get(i)).title);
                return;
            }
            long j = saveToGallerySettingsActivity.getSettings().limitVideo;
            if (saveToGallerySettingsActivity.dialogException != null) {
                textInfoPrivacyCell.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
                return;
            }
            int i3 = saveToGallerySettingsActivity.type;
            if (i3 == 1) {
                textInfoPrivacyCell.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
            } else if (i3 == 4) {
                textInfoPrivacyCell.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
            } else if (i3 == 2) {
                textInfoPrivacyCell.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Object shadowSectionCell;
            ?? r8;
            Object obj;
            SaveToGallerySettingsActivity saveToGallerySettingsActivity = SaveToGallerySettingsActivity.this;
            ?? r7 = 0;
            switch (i) {
                case 1:
                    TextCell textCell = new TextCell(viewGroup.getContext());
                    textCell.setTextAndIcon(R.drawable.msg_contact_add, (CharSequence) LocaleController.getString(R.string.NotificationsAddAnException), true);
                    textCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    textCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    shadowSectionCell = textCell;
                    r7 = shadowSectionCell;
                    break;
                case 2:
                    UserCell userCell = new UserCell(4, 0, viewGroup.getContext(), null, false, false);
                    userCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    r8 = userCell;
                    r7 = r8;
                    break;
                case 3:
                    shadowSectionCell = new ShadowSectionCell(viewGroup.getContext(), (Object) null);
                    r7 = shadowSectionCell;
                    break;
                case 4:
                    TextCell textCell2 = new TextCell(viewGroup.getContext());
                    textCell2.setText(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    textCell2.setColors(-1, Theme.key_text_RedRegular);
                    textCell2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    shadowSectionCell = textCell2;
                    r7 = shadowSectionCell;
                    break;
                case 5:
                    HeaderCell headerCell = new HeaderCell(viewGroup.getContext());
                    headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    shadowSectionCell = headerCell;
                    r7 = shadowSectionCell;
                    break;
                case 6:
                    TextCheckCell textCheckCell = new TextCheckCell(viewGroup.getContext());
                    textCheckCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    shadowSectionCell = textCheckCell;
                    r7 = shadowSectionCell;
                    break;
                case 7:
                    shadowSectionCell = new TextInfoPrivacyCell(viewGroup.getContext(), 24, null);
                    r7 = shadowSectionCell;
                    break;
                case 8:
                    ?? linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                    linearLayout.setOrientation(1);
                    final SeekBarView seekBarView = new SeekBarView(saveToGallerySettingsActivity.getParentActivity(), null, false);
                    FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                    final SelectableAnimatedTextView selectableAnimatedTextView = saveToGallerySettingsActivity.new SelectableAnimatedTextView(saveToGallerySettingsActivity.getParentActivity());
                    selectableAnimatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
                    selectableAnimatedTextView.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                    frameLayout.addView(selectableAnimatedTextView, LayoutHelper.createFrame(-2, -2, 83));
                    final SelectableAnimatedTextView selectableAnimatedTextView2 = saveToGallerySettingsActivity.new SelectableAnimatedTextView(saveToGallerySettingsActivity.getParentActivity());
                    selectableAnimatedTextView2.setTextSize(AndroidUtilities.dp(13.0f));
                    frameLayout.addView(selectableAnimatedTextView2, LayoutHelper.createFrame(-2, -2, 81));
                    final SelectableAnimatedTextView selectableAnimatedTextView3 = saveToGallerySettingsActivity.new SelectableAnimatedTextView(saveToGallerySettingsActivity.getParentActivity());
                    selectableAnimatedTextView3.setTextSize(AndroidUtilities.dp(13.0f));
                    selectableAnimatedTextView3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                    frameLayout.addView(selectableAnimatedTextView3, LayoutHelper.createFrame(-2, -2, 85));
                    linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 20, 0, 21, 10, 21, 0));
                    linearLayout.addView(seekBarView, LayoutHelper.createLinear(-1, 38, 0, 5, 0, 5, 4));
                    long j = saveToGallerySettingsActivity.getSettings().limitVideo;
                    if (j < 0 || j > 4194304000L) {
                        j = 4194304000L;
                    }
                    seekBarView.setReportChanges(true);
                    seekBarView.setDelegate(new SeekBarView.SeekBarViewDelegate() {
                        @Override
                        public final CharSequence getContentDescription() {
                            return null;
                        }

                        @Override
                        public final int getStepsCount() {
                            return 0;
                        }

                        @Override
                        public final void onSeekBarDrag(float f, boolean z) {
                            boolean zIsAttachedToWindow = seekBarView.isAttachedToWindow();
                            long j2 = f > 0.7f ? (long) ((4089446400L * ((f - 0.7f) / 0.3f)) + 104857600) : (long) ((104333312 * (f / 0.7f)) + 524288.0f);
                            SelectableAnimatedTextView selectableAnimatedTextView4 = selectableAnimatedTextView3;
                            SelectableAnimatedTextView selectableAnimatedTextView5 = selectableAnimatedTextView;
                            SelectableAnimatedTextView selectableAnimatedTextView6 = selectableAnimatedTextView2;
                            if (f >= 1.0f) {
                                selectableAnimatedTextView5.setSelectedInternal(false, zIsAttachedToWindow);
                                selectableAnimatedTextView6.setSelectedInternal(false, zIsAttachedToWindow);
                                selectableAnimatedTextView4.setSelectedInternal(true, zIsAttachedToWindow);
                                AndroidUtilities.updateViewVisibilityAnimated(selectableAnimatedTextView6, false, 0.8f, zIsAttachedToWindow);
                            } else if (f == 0.0f) {
                                selectableAnimatedTextView5.setSelectedInternal(true, zIsAttachedToWindow);
                                selectableAnimatedTextView6.setSelectedInternal(false, zIsAttachedToWindow);
                                selectableAnimatedTextView4.setSelectedInternal(false, zIsAttachedToWindow);
                                AndroidUtilities.updateViewVisibilityAnimated(selectableAnimatedTextView6, false, 0.8f, zIsAttachedToWindow);
                            } else {
                                selectableAnimatedTextView6.setText(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j2, true, false)), false, true);
                                selectableAnimatedTextView5.setSelectedInternal(false, zIsAttachedToWindow);
                                selectableAnimatedTextView6.setSelectedInternal(true, zIsAttachedToWindow);
                                selectableAnimatedTextView4.setSelectedInternal(false, zIsAttachedToWindow);
                                AndroidUtilities.updateViewVisibilityAnimated(selectableAnimatedTextView6, true, 0.8f, zIsAttachedToWindow);
                            }
                            if (z) {
                                SaveToGallerySettingsActivity saveToGallerySettingsActivity2 = SaveToGallerySettingsActivity.this;
                                saveToGallerySettingsActivity2.getSettings().limitVideo = j2;
                                saveToGallerySettingsActivity2.onSettingsUpdated();
                            }
                        }

                        @Override
                        public final void onSeekBarPressed() {
                        }
                    });
                    seekBarView.setProgress(((float) j) > ((float) 104857600) * 0.7f ? zzjd.m(j - 104857600, 4089446400L, 0.3f, 0.7f) : ((j - 524288) / 104333312) * 0.7f);
                    seekBarView.delegate.onSeekBarDrag(seekBarView.getProgress(), false);
                    linearLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    r8 = linearLayout;
                    r7 = r8;
                    break;
                case 9:
                    UserCell2 userCell2 = new UserCell2(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                    userCell2.setData(DialogObject.isUserDialog(saveToGallerySettingsActivity.dialogId) ? MessagesController.getInstance(((BaseFragment) saveToGallerySettingsActivity).currentAccount).getUser(Long.valueOf(saveToGallerySettingsActivity.dialogId)) : MessagesController.getInstance(((BaseFragment) saveToGallerySettingsActivity).currentAccount).getChat(Long.valueOf(-saveToGallerySettingsActivity.dialogId)), null);
                    userCell2.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                    obj = userCell2;
                    r7 = obj;
                    break;
                case 10:
                    ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(viewGroup.getContext(), (Object) null);
                    shadowSectionCell2.setBackgroundDrawable(Theme.getThemedDrawable(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, Theme.getColor(Theme.key_windowBackgroundGrayShadow, saveToGallerySettingsActivity.getResourceProvider())));
                    obj = shadowSectionCell2;
                    r7 = obj;
                    break;
            }
            return zzkl.m(r7, r7);
        }
    }

    public final class SelectableAnimatedTextView extends AnimatedTextView {
        public final AnimatedFloat progressToSelect;
        public boolean selected;

        public SelectableAnimatedTextView(Activity activity) {
            super(activity, true, true, false);
            this.progressToSelect = new AnimatedFloat(this);
            getDrawable().allowCancel = true;
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float f = this.selected ? 1.0f : 0.0f;
            AnimatedFloat animatedFloat = this.progressToSelect;
            animatedFloat.set(f, false);
            int i = Theme.key_windowBackgroundWhiteGrayText;
            SaveToGallerySettingsActivity saveToGallerySettingsActivity = SaveToGallerySettingsActivity.this;
            setTextColor(ColorUtils.blendARGB(animatedFloat.value, saveToGallerySettingsActivity.getThemedColor(i), saveToGallerySettingsActivity.getThemedColor(Theme.key_windowBackgroundWhiteBlueText)));
            super.dispatchDraw(canvas);
        }

        public final void setSelectedInternal(boolean z, boolean z2) {
            if (this.selected != z) {
                this.selected = z;
                this.progressToSelect.set(z ? 1.0f : 0.0f, z2);
                invalidate();
            }
        }
    }

    public SaveToGallerySettingsActivity(Bundle bundle) {
        super(bundle);
        this.items = new ArrayList();
        this.exceptionsDialogs = new LongSparseArray();
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        zzkt.m(this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 21));
        int i = 1;
        if (this.dialogException == null) {
            int i2 = this.type;
            if (i2 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryPrivate));
            } else if (i2 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryGroups));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryChannels));
            }
        } else if (this.isNewException) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsNewException));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.SaveToGalleryException));
        }
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.recyclerListView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.recyclerListView);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(400L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mSupportsChangeAnimations = false;
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        zzku.m(this.recyclerListView);
        RecyclerListView recyclerListView2 = this.recyclerListView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView2.setAdapter(adapter);
        this.recyclerListView.setOnItemClickListener(new SaveToGallerySettingsActivity$$ExternalSyntheticLambda0(this));
        this.recyclerListView.setOnItemLongClickListener(new SaveToGallerySettingsActivity$$ExternalSyntheticLambda0(this));
        frameLayout.addView(this.recyclerListView);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        if (this.dialogException != null) {
            FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
            frameLayout2.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{8.0f}, Theme.key_featuredStickers_addButton));
            TextView textView = new TextView(getParentActivity());
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(this.isNewException ? R.string.AddException : R.string.SaveException));
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2, 17));
            frameLayout2.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(this, i));
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        }
        updateRows$28();
        return this.fragmentView;
    }

    public final SaveToGallerySettingsHelper.Settings getSettings() {
        SaveToGallerySettingsHelper.DialogException dialogException = this.dialogException;
        return dialogException != null ? dialogException : SaveToGallerySettingsHelper.getSettings(this.type);
    }

    @Override
    public final boolean onFragmentCreate() {
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
    public final void onResume() {
        super.onResume();
        updateRows$28();
    }

    public final void onSettingsUpdated() {
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

    public final void updateRows$28() {
        ArrayList arrayList;
        int i = 0;
        boolean z = (this.isPaused || this.adapter == null) ? false : true;
        ArrayList arrayList2 = this.items;
        String string = null;
        if (z) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        if (this.dialogException != null) {
            arrayList2.add(new Item(9));
            arrayList2.add(new Item(3));
        }
        arrayList2.add(new Item(5, LocaleController.getString(R.string.SaveToGallery)));
        this.savePhotosRow = arrayList2.size();
        arrayList2.add(new Item(6));
        this.saveVideosRow = arrayList2.size();
        arrayList2.add(new Item(6));
        if (this.dialogException != null) {
            string = LocaleController.getString(R.string.SaveToGalleryHintCurrent);
        } else {
            int i2 = this.type;
            if (i2 == 1) {
                string = LocaleController.getString(R.string.SaveToGalleryHintUser);
            } else if (i2 == 4) {
                string = LocaleController.getString(R.string.SaveToGalleryHintChannels);
            } else if (i2 == 2) {
                string = LocaleController.getString(R.string.SaveToGalleryHintGroup);
            }
        }
        arrayList2.add(new Item(7, string));
        if (getSettings().saveVideo) {
            arrayList2.add(new Item(5, LocaleController.getString(R.string.MaxVideoSize)));
            arrayList2.size();
            arrayList2.add(new Item(8));
            this.videoDividerRow = arrayList2.size();
            arrayList2.add(new Item(7));
        } else {
            this.videoDividerRow = -1;
        }
        if (this.dialogException == null) {
            this.exceptionsDialogs = getUserConfig().getSaveGalleryExceptions(this.type);
            arrayList2.size();
            arrayList2.add(new Item(1));
            boolean z2 = false;
            while (i < this.exceptionsDialogs.size()) {
                arrayList2.add(new Item((SaveToGallerySettingsHelper.DialogException) this.exceptionsDialogs.valueAt(i)));
                i++;
                z2 = true;
            }
            if (z2) {
                arrayList2.add(new Item(3));
                arrayList2.size();
                arrayList2.add(new Item(4));
            }
            arrayList2.add(new Item(10));
        }
        Adapter adapter = this.adapter;
        if (adapter != null) {
            if (arrayList != null) {
                adapter.setItems(arrayList, arrayList2);
            } else {
                adapter.mObservable.notifyChanged();
            }
        }
    }

    public final class Item extends AdapterWithDiffUtils.Item {
        public final SaveToGallerySettingsHelper.DialogException exception;
        public final String title;

        public Item(int i) {
            super(i, false);
            this.exception = null;
        }

        public final boolean equals(Object obj) {
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
                return str.equals(item.title);
            }
            SaveToGallerySettingsHelper.DialogException dialogException2 = this.exception;
            return dialogException2 == null || (dialogException = item.exception) == null || dialogException2.dialogId == dialogException.dialogId;
        }

        public Item(SaveToGallerySettingsHelper.DialogException dialogException) {
            super(2, false);
            this.exception = dialogException;
        }

        public Item(int i, String str) {
            super(i, false);
            this.title = str;
            this.exception = null;
        }
    }
}
