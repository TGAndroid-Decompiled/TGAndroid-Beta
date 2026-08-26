package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.StickerSetCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.StickersAlert;

public final class GroupStickersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public AddEmojiCell addEmojiCell;
    public int addEmojiPackHintRow;
    public int addEmojiPackRow;
    public int addEmojiPackTitleRow;
    public final long chatId;
    public int currentEmojiPackRow;
    public FrameLayout emptyFrameView;
    public StickerEmptyView emptyView;
    public int headerRow;
    public TLRPC.ChatFull info;
    public int infoRow;
    public final boolean isEmoji;
    public LinearLayoutManager layoutManager;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public FlickerLoadingView loadingView;
    public boolean removeStickerSet;
    public int rowCount;
    public SearchAdapter searchAdapter;
    public ActionBarMenuItem searchItem;
    public boolean searching;
    public TLRPC.TL_messages_stickerSet selectedStickerSet;
    public int selectedStickerSetIndex;
    public int stickersEndRow;
    public int stickersStartRow;

    public final class AnonymousClass4 {
        public final boolean val$isSelected;
        public final TLRPC.TL_messages_stickerSet val$stickerSet;

        public AnonymousClass4(boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            this.val$isSelected = z;
            this.val$stickerSet = tL_messages_stickerSet;
        }
    }

    public final class AddEmojiCell extends LinearLayout {
        public final EditTextCaption editText;
        public LaunchActivity$$ExternalSyntheticLambda13 lastCallback;
        public String lastQuery;
        public boolean needDivider;
        public int reqId;
        public final AnonymousClass1 textWatcher;

        public final class AnonymousClass1 implements TextWatcher {
            public AnonymousClass1() {
            }

            @Override
            public final void afterTextChanged(Editable editable) {
                String strTrim = editable.toString().trim();
                AddEmojiCell addEmojiCell = AddEmojiCell.this;
                int i = addEmojiCell.reqId;
                GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
                if (i != 0) {
                    groupStickersActivity.getConnectionsManager().cancelRequest(addEmojiCell.reqId, true);
                    addEmojiCell.reqId = 0;
                }
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = addEmojiCell.lastCallback;
                if (launchActivity$$ExternalSyntheticLambda13 != null) {
                    AndroidUtilities.cancelRunOnUIThread(launchActivity$$ExternalSyntheticLambda13);
                }
                addEmojiCell.lastQuery = null;
                if (strTrim.isEmpty()) {
                    GroupStickersActivity.access$3100(groupStickersActivity, null);
                    return;
                }
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda14 = new LaunchActivity$$ExternalSyntheticLambda13(16, this, strTrim);
                addEmojiCell.lastCallback = launchActivity$$ExternalSyntheticLambda14;
                AndroidUtilities.runOnUIThread(launchActivity$$ExternalSyntheticLambda14, 300L);
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        public AddEmojiCell(Context context) {
            super(context);
            this.textWatcher = new AnonymousClass1();
            TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 16.0f);
            textViewM.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
            textViewM.setText("t.me/addemoji/");
            EditTextCaption editTextCaption = new EditTextCaption(context, null);
            this.editText = editTextCaption;
            editTextCaption.setLines(1);
            editTextCaption.setSingleLine(true);
            editTextCaption.setInputType(16384);
            editTextCaption.setTextSize(1, 16.0f);
            editTextCaption.setTextColor(Theme.getColor(null, Theme.key_chat_messagePanelText, false));
            editTextCaption.setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkOut, false));
            editTextCaption.setHighlightColor(Theme.getColor(null, Theme.key_chat_inTextSelectionHighlight, false));
            int i = Theme.key_chat_messagePanelHint;
            editTextCaption.setHintColor(Theme.getColor(null, i, false));
            editTextCaption.setHintTextColor(Theme.getColor(null, i, false));
            editTextCaption.setCursorColor(Theme.getColor(null, Theme.key_chat_messagePanelCursor, false));
            editTextCaption.setHandlesColor(Theme.getColor(null, Theme.key_chat_TextSelectionCursor, false));
            editTextCaption.setBackground(null);
            editTextCaption.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
            addView(textViewM, LayoutHelper.createLinear(-2, -2, 16, 20, 0, 0, 0));
            addView(editTextCaption, LayoutHelper.createLinear(-1, -2, 16, -4, 0, 0, 0));
            setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
            setWillNotDraw(false);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, Theme.dividerPaint);
            }
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return GroupStickersActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
            if ((i >= groupStickersActivity.stickersStartRow && i < groupStickersActivity.stickersEndRow) || i == groupStickersActivity.currentEmojiPackRow) {
                return 0;
            }
            if (i == groupStickersActivity.headerRow || i == groupStickersActivity.addEmojiPackTitleRow) {
                return 4;
            }
            if (i == groupStickersActivity.infoRow || i == groupStickersActivity.addEmojiPackHintRow) {
                return 1;
            }
            return i == groupStickersActivity.addEmojiPackRow ? 5 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 0;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            int i2 = viewHolder.mItemViewType;
            GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                StickerSetCell stickerSetCell = (StickerSetCell) view;
                if (i == groupStickersActivity.currentEmojiPackRow) {
                    stickerSetCell.setChecked(false, false);
                    stickerSetCell.setStickersSet(groupStickersActivity.selectedStickerSet, false, false);
                    stickerSetCell.setDeleteAction(new OAuthSheet$$ExternalSyntheticLambda4(this, 3));
                    return;
                }
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(((BaseFragment) groupStickersActivity).currentAccount).getStickerSets(groupStickersActivity.getStickerSetType());
                int i3 = i - groupStickersActivity.stickersStartRow;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i3);
                stickerSetCell.setStickersSet(stickerSets.get(i3), i3 != stickerSets.size() - 1, false);
                stickerSetCell.setDeleteAction(null);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = groupStickersActivity.selectedStickerSet;
                if (tL_messages_stickerSet2 != null) {
                    j = tL_messages_stickerSet2.set.id;
                } else {
                    j = groupStickersActivity.getStickerSet(groupStickersActivity.info) != null ? groupStickersActivity.getStickerSet(groupStickersActivity.info).id : 0L;
                }
                stickerSetCell.setChecked(tL_messages_stickerSet.set.id == j, false);
                return;
            }
            boolean z = groupStickersActivity.isEmoji;
            if (i2 == 1) {
                if (i != groupStickersActivity.infoRow) {
                    if (i == groupStickersActivity.addEmojiPackHintRow) {
                        ((TextInfoPrivacyCell) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                        return;
                    }
                    return;
                }
                String string = LocaleController.getString(z ? R.string.ChooseEmojiPackMy : R.string.ChooseStickerSetMy);
                int iIndexOf = string.indexOf("@stickers");
                if (iIndexOf == -1) {
                    ((TextInfoPrivacyCell) view).setText(string);
                    return;
                }
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    spannableStringBuilder.setSpan(new StickersActivity.AnonymousClass4(this, 4), iIndexOf, iIndexOf + 9, 18);
                    ((TextInfoPrivacyCell) view).setText(spannableStringBuilder);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    ((TextInfoPrivacyCell) view).setText(string);
                    return;
                }
            }
            if (i2 == 4) {
                if (i == groupStickersActivity.addEmojiPackTitleRow) {
                    ((HeaderCell) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    ((HeaderCell) view).setText(LocaleController.getString(z ? R.string.ChooseEmojiPackHeader : R.string.ChooseStickerSetHeader));
                    return;
                }
            }
            if (i2 != 5) {
                return;
            }
            AddEmojiCell addEmojiCell = (AddEmojiCell) view;
            boolean z2 = groupStickersActivity.currentEmojiPackRow > 0;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = groupStickersActivity.selectedStickerSet;
            addEmojiCell.needDivider = z2;
            EditTextCaption editTextCaption = addEmojiCell.editText;
            AddEmojiCell.AnonymousClass1 anonymousClass1 = addEmojiCell.textWatcher;
            editTextCaption.removeTextChangedListener(anonymousClass1);
            if (tL_messages_stickerSet3 == null) {
                editTextCaption.setText("");
            } else {
                String str = tL_messages_stickerSet3.set.short_name;
                editTextCaption.setText(str);
                editTextCaption.setSelection(str.length());
            }
            editTextCaption.addTextChangedListener(anonymousClass1);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            Context context = this.mContext;
            if (i == 0) {
                StickerSetCell stickerSetCell = new StickerSetCell(context, 3);
                stickerSetCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                view = stickerSetCell;
            } else if (i == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
                textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                view = textInfoPrivacyCell;
            } else if (i != 5) {
                HeaderCell headerCell = new HeaderCell(context);
                headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                view = headerCell;
            } else {
                GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
                AddEmojiCell addEmojiCell = groupStickersActivity.new AddEmojiCell(context);
                groupStickersActivity.addEmojiCell = addEmojiCell;
                view = addEmojiCell;
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }
    }

    public final class SearchAdapter extends RecyclerListView.SelectionAdapter {
        public LaunchActivity$$ExternalSyntheticLambda13 lastCallback;
        public String lastQuery;
        public final Context mContext;
        public int reqId;
        public ArrayList searchEntries = new ArrayList();
        public ArrayList localSearchEntries = new ArrayList();

        public SearchAdapter(Context context) {
            this.mContext = context;
            setHasStableIds(true);
        }

        @Override
        public final int getItemCount() {
            return this.localSearchEntries.size() + this.searchEntries.size() + (!this.localSearchEntries.isEmpty() ? 1 : 0);
        }

        @Override
        public final long getItemId(int i) {
            if (getItemViewType(i) != 0) {
                return -1L;
            }
            ArrayList arrayList = i > this.searchEntries.size() ? this.localSearchEntries : this.searchEntries;
            if (i > this.searchEntries.size()) {
                i = (i - this.searchEntries.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i)).set.id;
        }

        @Override
        public final int getItemViewType(int i) {
            return this.searchEntries.size() == i ? 1 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return getItemViewType(viewHolder.getAdapterPosition()) == 0;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            if (getItemViewType(i) != 0) {
                return;
            }
            boolean z = i > this.searchEntries.size();
            ArrayList arrayList = z ? this.localSearchEntries : this.searchEntries;
            if (z) {
                i = (i - this.searchEntries.size()) - 1;
            }
            StickerSetCell stickerSetCell = (StickerSetCell) viewHolder.itemView;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i);
            stickerSetCell.setStickersSet(tL_messages_stickerSet, i != arrayList.size() - 1, !z);
            String str = this.lastQuery;
            String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
            GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
            Theme.ResourcesProvider resourceProvider = groupStickersActivity.getResourceProvider();
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            String str2 = stickerSet.title;
            Locale locale = Locale.ROOT;
            int iIndexOf = str2.toLowerCase(locale).indexOf(lowerCase);
            if (iIndexOf != -1) {
                SpannableString spannableString = new SpannableString(stickerSet.title);
                spannableString.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, resourceProvider), iIndexOf, lowerCase.length() + iIndexOf, 0);
                stickerSetCell.textView.setText(spannableString);
            }
            int iIndexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
            if (iIndexOf2 != -1) {
                String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
                int length = str3.length() + iIndexOf2;
                StringBuilder sbM = Log.m(str3);
                sbM.append(stickerSet.short_name);
                SpannableString spannableString2 = new SpannableString(sbM.toString());
                spannableString2.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, resourceProvider), length, lowerCase.length() + length, 0);
                stickerSetCell.valueTextView.setText(spannableString2);
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = groupStickersActivity.selectedStickerSet;
            if (tL_messages_stickerSet2 != null) {
                j = tL_messages_stickerSet2.set.id;
            } else {
                j = groupStickersActivity.getStickerSet(groupStickersActivity.info) != null ? groupStickersActivity.getStickerSet(groupStickersActivity.info).id : 0L;
            }
            stickerSetCell.setChecked(tL_messages_stickerSet.set.id == j, false);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            Context context = this.mContext;
            if (i != 0) {
                int i2 = Theme.key_windowBackgroundWhiteGrayText4;
                GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
                HeaderCell headerCell = new HeaderCell(this.mContext, i2, 21, 0, 0, false, false, groupStickersActivity.getResourceProvider());
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(groupStickersActivity.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                combinedDrawable.fullSize = true;
                headerCell.setBackground(combinedDrawable);
                headerCell.setText(LocaleController.getString(groupStickersActivity.isEmoji ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
                view = headerCell;
            } else {
                StickerSetCell stickerSetCell = new StickerSetCell(context, 3);
                stickerSetCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                view = stickerSetCell;
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        public final void onSearchStickers(String str) {
            GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
            if (groupStickersActivity.isEmoji) {
                if (TextUtils.isEmpty(str)) {
                    groupStickersActivity.listView.setBackground(null);
                } else {
                    groupStickersActivity.listView.setBackgroundColor(groupStickersActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                }
            }
            if (this.reqId != 0) {
                groupStickersActivity.getConnectionsManager().cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
            LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = this.lastCallback;
            if (launchActivity$$ExternalSyntheticLambda13 != null) {
                AndroidUtilities.cancelRunOnUIThread(launchActivity$$ExternalSyntheticLambda13);
                this.lastCallback = null;
            }
            this.lastQuery = null;
            int itemCount = getItemCount();
            if (itemCount > 0) {
                this.searchEntries.clear();
                this.localSearchEntries.clear();
                this.mObservable.notifyItemRangeRemoved(0, itemCount);
            }
            if (TextUtils.isEmpty(str)) {
                groupStickersActivity.emptyView.setVisibility(8);
                groupStickersActivity.emptyView.showProgress(false, true);
                return;
            }
            if (groupStickersActivity.emptyView.getVisibility() != 0) {
                groupStickersActivity.emptyView.setVisibility(0);
                groupStickersActivity.emptyView.showProgress(true, false);
            } else {
                groupStickersActivity.emptyView.showProgress(true, true);
            }
            LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda14 = new LaunchActivity$$ExternalSyntheticLambda13(18, this, str);
            this.lastCallback = launchActivity$$ExternalSyntheticLambda14;
            AndroidUtilities.runOnUIThread(launchActivity$$ExternalSyntheticLambda14, 300L);
        }
    }

    public GroupStickersActivity(long j) {
        super(null);
        this.selectedStickerSetIndex = -1;
        this.chatId = j;
    }

    public static void access$3100(GroupStickersActivity groupStickersActivity, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i = groupStickersActivity.selectedStickerSetIndex;
        if (tL_messages_stickerSet == null) {
            if (groupStickersActivity.selectedStickerSet != null) {
                FactCheckController$$ExternalSyntheticOutline0.m(R.string.GroupsEmojiPackUpdated, BulletinFactory.of(groupStickersActivity), R.raw.done, 36);
            }
            groupStickersActivity.selectedStickerSet = null;
            groupStickersActivity.removeStickerSet = true;
        } else {
            groupStickersActivity.selectedStickerSet = tL_messages_stickerSet;
            groupStickersActivity.removeStickerSet = false;
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.GroupsEmojiPackUpdated, BulletinFactory.of(groupStickersActivity), R.raw.done, 36);
        }
        groupStickersActivity.updateSelectedStickerSetIndex();
        groupStickersActivity.updateCurrentPackVisibility(groupStickersActivity.selectedStickerSet, false);
        if (i != -1) {
            if (groupStickersActivity.searching) {
                groupStickersActivity.listAdapter.notifyItemChanged(groupStickersActivity.stickersStartRow + i);
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= groupStickersActivity.listView.getChildCount()) {
                    groupStickersActivity.listAdapter.notifyItemChanged(groupStickersActivity.stickersStartRow + i);
                    break;
                }
                View childAt = groupStickersActivity.listView.getChildAt(i2);
                if (groupStickersActivity.listView.getChildViewHolder(childAt).getAdapterPosition() == groupStickersActivity.stickersStartRow + i) {
                    ((StickerSetCell) childAt).setChecked(false, true);
                    break;
                }
                i2++;
            }
        }
        if (groupStickersActivity.selectedStickerSetIndex != -1) {
            if (!groupStickersActivity.searching) {
                for (int i3 = 0; i3 < groupStickersActivity.listView.getChildCount(); i3++) {
                    View childAt2 = groupStickersActivity.listView.getChildAt(i3);
                    if (groupStickersActivity.listView.getChildViewHolder(childAt2).getAdapterPosition() == groupStickersActivity.stickersStartRow + groupStickersActivity.selectedStickerSetIndex) {
                        ((StickerSetCell) childAt2).setChecked(true, true);
                        return;
                    }
                }
            }
            groupStickersActivity.listAdapter.notifyItemChanged(groupStickersActivity.stickersStartRow + groupStickersActivity.selectedStickerSetIndex);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(this.isEmoji ? R.string.GroupEmojiPack : R.string.GroupStickers));
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 24));
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
        this.searchItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 11);
        this.searchItem.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.listAdapter = new ListAdapter(context);
        this.searchAdapter = new SearchAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        this.listView = new RecyclerListView(context, null);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(200L);
        defaultItemAnimator.mSupportsChangeAnimations = true;
        this.listView.setItemAnimator(defaultItemAnimator);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        this.listView.setLayoutManager(this.layoutManager);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.emptyFrameView = frameLayout2;
        frameLayout2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, getResourceProvider());
        this.loadingView = flickerLoadingView;
        flickerLoadingView.setViewType(19);
        this.loadingView.setIsSingleCell(true);
        this.loadingView.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.emptyFrameView.addView(this.loadingView, LayoutHelper.createFrame(-1.0f, -1));
        StickerEmptyView stickerEmptyView = new StickerEmptyView(1, null, context, this.loadingView);
        this.emptyView = stickerEmptyView;
        new PhotoViewer.AnonymousClass14(stickerEmptyView);
        this.emptyFrameView.addView(this.emptyView);
        frameLayout.addView(this.emptyFrameView);
        this.emptyFrameView.setVisibility(8);
        this.listView.setEmptyView(this.emptyFrameView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 16));
        this.listView.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 24));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == getStickerSetType()) {
                updateRows$4(true);
                return;
            }
            return;
        }
        if (i != NotificationCenter.chatInfoDidLoad) {
            if (i == NotificationCenter.groupStickersDidLoad) {
                long jLongValue = ((Long) objArr[0]).longValue();
                if (getStickerSet(this.info) == null || getStickerSet(this.info).id != jLongValue) {
                    return;
                }
                updateRows$4(true);
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull.id == this.chatId) {
            if (this.info == null && getStickerSet(chatFull) != null) {
                this.selectedStickerSet = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(getStickerSet(chatFull));
            }
            this.info = chatFull;
            updateRows$4(true);
        }
    }

    public final TLRPC.StickerSet getStickerSet(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        return this.isEmoji ? chatFull.emojiset : chatFull.stickerset;
    }

    public final int getStickerSetType() {
        return this.isEmoji ? 5 : 0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{StickerSetCell.class, TextSettingsCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i2 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 2, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteLinkText));
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 196608, new Class[]{StickerSetCell.class}, new String[]{"optionsButton"}, null, null, -1, null, Theme.key_stickers_menuSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerSetCell.class}, new String[]{"optionsButton"}, null, null, -1, null, Theme.key_stickers_menu));
        return arrayList;
    }

    public final void lambda$createView$0$1(int i, View view) {
        if (getParentActivity() == null) {
            return;
        }
        if (!this.searching) {
            if (i >= this.stickersStartRow && i < this.stickersEndRow) {
                onStickerSetClicked(MediaDataController.getInstance(this.currentAccount).getStickerSets(getStickerSetType()).get(i - this.stickersStartRow), ((StickerSetCell) view).isChecked(), false);
            }
            if (i == this.currentEmojiPackRow) {
                onStickerSetClicked(this.selectedStickerSet, true, false);
                return;
            }
            return;
        }
        if (i > this.searchAdapter.searchEntries.size()) {
            boolean zIsChecked = ((StickerSetCell) view).isChecked();
            SearchAdapter searchAdapter = this.searchAdapter;
            onStickerSetClicked((TLRPC.TL_messages_stickerSet) searchAdapter.localSearchEntries.get((i - searchAdapter.searchEntries.size()) - 1), zIsChecked, false);
        } else if (i != this.searchAdapter.searchEntries.size()) {
            onStickerSetClicked((TLRPC.TL_messages_stickerSet) this.searchAdapter.searchEntries.get(i), ((StickerSetCell) view).isChecked(), true);
        }
    }

    public final void lambda$saveStickerSet$1(TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (getParentActivity() != null) {
                Activity parentActivity = getParentActivity();
                StringBuilder sb = new StringBuilder();
                zzlf.m(R.string.ErrorOccurred, "\n", sb);
                sb.append(tL_error.text);
                Toast.makeText(parentActivity, sb.toString(), 0).show();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.selectedStickerSet;
        boolean z = this.isEmoji;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (z) {
                this.info.emojiset = stickerSet;
            } else {
                this.info.stickerset = stickerSet;
            }
            MediaDataController.getInstance(this.currentAccount).putGroupStickerSet(this.selectedStickerSet);
        } else if (z) {
            this.info.emojiset = null;
        } else {
            this.info.stickerset = null;
        }
        updateSelectedStickerSetIndex();
        if (z) {
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull.emojiset != null) {
                chatFull.flags2 |= 1024;
            } else {
                chatFull.flags2 &= -1025;
            }
        } else {
            TLRPC.ChatFull chatFull2 = this.info;
            if (chatFull2.stickerset == null) {
                chatFull2.flags |= 256;
            } else {
                chatFull2.flags &= -257;
            }
        }
        MessagesStorage.getInstance(this.currentAccount).updateChatInfo(this.info, false);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, this.info, 0, Boolean.TRUE, Boolean.FALSE);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(this.info.id), Boolean.valueOf(z));
        finishFragment();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(getStickerSetType());
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        updateRows$4(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLObject tLObject;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        if ((this.selectedStickerSet != null || this.removeStickerSet) && (chatFull = this.info) != null) {
            if (getStickerSet(chatFull) == null || (tL_messages_stickerSet = this.selectedStickerSet) == null || tL_messages_stickerSet.set.id != getStickerSet(this.info).id) {
                if (getStickerSet(this.info) == null && this.selectedStickerSet == null) {
                    return;
                }
                boolean z = this.isEmoji;
                long j = this.chatId;
                if (z) {
                    TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                    tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j);
                    if (this.removeStickerSet) {
                        tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tLObject = tL_channels_setEmojiStickers;
                    } else {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                        TLRPC.StickerSet stickerSet = this.selectedStickerSet.set;
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        tLObject = tL_channels_setEmojiStickers;
                    }
                } else {
                    TLRPC.TL_channels_setStickers tL_channels_setStickers = new TLRPC.TL_channels_setStickers();
                    tL_channels_setStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j);
                    if (this.removeStickerSet) {
                        tL_channels_setStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tLObject = tL_channels_setStickers;
                    } else {
                        MessagesController.getEmojiSettings(this.currentAccount).edit().remove("group_hide_stickers_" + this.info.id).apply();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setStickers.stickerset = tL_inputStickerSetID2;
                        TLRPC.StickerSet stickerSet2 = this.selectedStickerSet.set;
                        tL_inputStickerSetID2.id = stickerSet2.id;
                        tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                        tLObject = tL_channels_setStickers;
                    }
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, new LinkManager$$ExternalSyntheticLambda3(this, 12));
            }
        }
    }

    public final void onStickerSetClicked(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z, boolean z2) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        if (z2) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        StickersAlert stickersAlert = new StickersAlert(getParentActivity(), this, tL_inputStickerSetShortName, !z2 ? tL_messages_stickerSet : null, null, null);
        stickersAlert.customButtonDelegate = new AnonymousClass4(z, tL_messages_stickerSet);
        stickersAlert.updateFields();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        stickersAlert.show();
    }

    public final void setInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
        if (getStickerSet(chatFull) != null) {
            this.selectedStickerSet = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(getStickerSet(this.info));
        }
    }

    public final void updateCurrentPackVisibility(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z) {
        if (this.isEmoji) {
            if (tL_messages_stickerSet == null) {
                int i = this.currentEmojiPackRow;
                boolean z2 = i > 0;
                this.selectedStickerSet = null;
                if (z2) {
                    this.listAdapter.mObservable.notifyItemRangeRemoved(i, 1);
                    if (z) {
                        this.listAdapter.notifyItemChanged(this.addEmojiPackRow);
                    }
                }
                updateRows$4(false);
                AddEmojiCell addEmojiCell = this.addEmojiCell;
                addEmojiCell.needDivider = false;
                addEmojiCell.invalidate();
                return;
            }
            boolean z3 = this.currentEmojiPackRow == -1;
            this.selectedStickerSet = tL_messages_stickerSet;
            updateRows$4(false);
            if (z3) {
                this.listAdapter.mObservable.notifyItemRangeInserted(this.currentEmojiPackRow, 1);
            } else {
                this.listAdapter.notifyItemChanged(this.currentEmojiPackRow);
            }
            if (z) {
                this.listAdapter.notifyItemChanged(this.addEmojiPackRow);
            }
            AddEmojiCell addEmojiCell2 = this.addEmojiCell;
            addEmojiCell2.needDivider = true;
            addEmojiCell2.invalidate();
        }
    }

    public final void updateRows$4(boolean z) {
        ListAdapter listAdapter;
        this.addEmojiPackTitleRow = -1;
        this.addEmojiPackRow = -1;
        this.currentEmojiPackRow = -1;
        this.addEmojiPackHintRow = -1;
        this.rowCount = 0;
        if (this.isEmoji) {
            this.addEmojiPackTitleRow = 0;
            this.rowCount = 2;
            this.addEmojiPackRow = 1;
            if (this.selectedStickerSet != null) {
                this.rowCount = 3;
                this.currentEmojiPackRow = 2;
            }
            int i = this.rowCount;
            this.rowCount = i + 1;
            this.addEmojiPackHintRow = i;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(getStickerSetType());
        if (stickerSets.isEmpty()) {
            this.headerRow = -1;
            this.stickersStartRow = -1;
            this.stickersEndRow = -1;
        } else {
            int i2 = this.rowCount;
            int i3 = i2 + 1;
            this.rowCount = i3;
            this.headerRow = i2;
            this.stickersStartRow = i3;
            this.stickersEndRow = stickerSets.size() + i3;
            this.rowCount = stickerSets.size() + this.rowCount;
        }
        int i4 = this.rowCount;
        this.rowCount = i4 + 1;
        this.infoRow = i4;
        updateSelectedStickerSetIndex();
        if (!z || (listAdapter = this.listAdapter) == null) {
            return;
        }
        listAdapter.mObservable.notifyChanged();
    }

    public final void updateSelectedStickerSetIndex() {
        long j;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(getStickerSetType());
        this.selectedStickerSetIndex = -1;
        if (this.removeStickerSet) {
            j = 0;
        } else {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.selectedStickerSet;
            if (tL_messages_stickerSet != null) {
                j = tL_messages_stickerSet.set.id;
            } else if (getStickerSet(this.info) != null) {
                j = getStickerSet(this.info).id;
            } else {
                j = 0;
            }
        }
        if (j != 0) {
            for (int i = 0; i < stickerSets.size(); i++) {
                if (stickerSets.get(i).set.id == j) {
                    this.selectedStickerSetIndex = i;
                    return;
                }
            }
        }
    }

    public GroupStickersActivity(long j, int i) {
        super(null);
        this.selectedStickerSetIndex = -1;
        this.chatId = j;
        this.isEmoji = true;
    }
}
