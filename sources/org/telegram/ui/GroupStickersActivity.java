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
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
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
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.VerticalPositionAutoAnimator;

public class GroupStickersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private AddEmojiCell addEmojiCell;
    private int addEmojiPackHintRow;
    private int addEmojiPackRow;
    private int addEmojiPackTitleRow;
    private final long chatId;
    private int currentEmojiPackRow;
    private FrameLayout emptyFrameView;
    private StickerEmptyView emptyView;
    private int headerRow;
    private TLRPC.ChatFull info;
    private int infoRow;
    private boolean isEmoji;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private FlickerLoadingView loadingView;
    private boolean removeStickerSet;
    private int rowCount;
    private SearchAdapter searchAdapter;
    private ActionBarMenuItem searchItem;
    private boolean searching;
    private TLRPC.TL_messages_stickerSet selectedStickerSet;
    private int selectedStickerSetIndex;
    private int stickersEndRow;
    private int stickersStartRow;

    public class AnonymousClass4 implements StickersAlert.StickersAlertCustomButtonDelegate {
        final boolean val$isSelected;
        final TLRPC.TL_messages_stickerSet val$stickerSet;

        public AnonymousClass4(boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            this.val$isSelected = z;
            this.val$stickerSet = tL_messages_stickerSet;
        }

        public void lambda$onCustomButtonPressed$0() {
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.GroupsEmojiPackUpdated, BulletinFactory.of(GroupStickersActivity.this), R.raw.done);
        }

        @Override
        public int getCustomButtonColorKey() {
            if (this.val$isSelected) {
                return -1;
            }
            return Theme.key_featuredStickers_addButton;
        }

        @Override
        public int getCustomButtonRippleColorKey() {
            if (this.val$isSelected) {
                return -1;
            }
            return Theme.key_featuredStickers_addButtonPressed;
        }

        @Override
        public String getCustomButtonText() {
            if (GroupStickersActivity.this.isEmoji) {
                return LocaleController.getString(this.val$isSelected ? R.string.RemoveGroupEmojiPackSet : R.string.SetAsGroupEmojiPackSet);
            }
            return LocaleController.getString(this.val$isSelected ? R.string.RemoveGroupStickerSet : R.string.SetAsGroupStickerSet);
        }

        @Override
        public int getCustomButtonTextColorKey() {
            return this.val$isSelected ? Theme.key_text_RedBold : Theme.key_featuredStickers_buttonText;
        }

        @Override
        public boolean onCustomButtonPressed() {
            int iFindFirstVisibleItemPosition = GroupStickersActivity.this.layoutManager.findFirstVisibleItemPosition();
            RecyclerListView.Holder holder = (RecyclerListView.Holder) GroupStickersActivity.this.listView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
            int top = holder != null ? holder.itemView.getTop() : Integer.MAX_VALUE;
            int i = GroupStickersActivity.this.selectedStickerSetIndex;
            if (this.val$isSelected) {
                GroupStickersActivity.this.selectedStickerSet = null;
                GroupStickersActivity.this.removeStickerSet = true;
            } else {
                GroupStickersActivity.this.selectedStickerSet = this.val$stickerSet;
                GroupStickersActivity.this.removeStickerSet = false;
            }
            if (GroupStickersActivity.this.isEmoji) {
                AndroidUtilities.runOnUIThread(new ChatActivity$21$$ExternalSyntheticLambda4(this, 26), 350L);
            }
            GroupStickersActivity.this.updateSelectedStickerSetIndex();
            GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
            groupStickersActivity.updateCurrentPackVisibility(groupStickersActivity.selectedStickerSet, true);
            if (i != -1) {
                if (!GroupStickersActivity.this.searching) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= GroupStickersActivity.this.listView.getChildCount()) {
                            GroupStickersActivity.this.listAdapter.lambda$onBindViewHolder$31(i);
                            break;
                        }
                        View childAt = GroupStickersActivity.this.listView.getChildAt(i2);
                        if (GroupStickersActivity.this.listView.getChildViewHolder(childAt).getAdapterPosition() == GroupStickersActivity.this.stickersStartRow + i) {
                            ((StickerSetCell) childAt).setChecked(false, true);
                            break;
                        }
                        i2++;
                    }
                } else {
                    GroupStickersActivity.this.listAdapter.lambda$onBindViewHolder$31(i);
                    break;
                }
            }
            if (GroupStickersActivity.this.selectedStickerSetIndex != -1) {
                if (!GroupStickersActivity.this.searching) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= GroupStickersActivity.this.listView.getChildCount()) {
                            GroupStickersActivity.this.listAdapter.lambda$onBindViewHolder$31(GroupStickersActivity.this.selectedStickerSetIndex);
                            break;
                        }
                        View childAt2 = GroupStickersActivity.this.listView.getChildAt(i3);
                        if (GroupStickersActivity.this.listView.getChildViewHolder(childAt2).getAdapterPosition() == GroupStickersActivity.this.selectedStickerSetIndex + GroupStickersActivity.this.stickersStartRow) {
                            ((StickerSetCell) childAt2).setChecked(true, true);
                            break;
                        }
                        i3++;
                    }
                } else {
                    GroupStickersActivity.this.listAdapter.lambda$onBindViewHolder$31(GroupStickersActivity.this.selectedStickerSetIndex);
                    break;
                }
            }
            if (top != Integer.MAX_VALUE && !GroupStickersActivity.this.isEmoji) {
                GroupStickersActivity.this.layoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition + 1, top);
            }
            if (GroupStickersActivity.this.searching) {
                GroupStickersActivity.this.searchItem.setSearchFieldText("", false);
                ((BaseFragment) GroupStickersActivity.this).actionBar.closeSearchField(true);
            }
            return true;
        }
    }

    public class AddEmojiCell extends LinearLayout {
        private final EditTextCaption editText;
        private Runnable lastCallback;
        private String lastQuery;
        private boolean needDivider;
        private int reqId;
        private final TextWatcher textWatcher;

        public class AnonymousClass1 implements TextWatcher {
            public AnonymousClass1() {
            }

            public void lambda$afterTextChanged$0(TLObject tLObject) {
                if (tLObject != null) {
                    GroupStickersActivity.this.selectSetAfterSearch((TLRPC.TL_messages_stickerSet) tLObject);
                } else {
                    GroupStickersActivity.this.selectSetAfterSearch(null);
                }
            }

            public void lambda$afterTextChanged$1(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
                if (Objects.equals(AddEmojiCell.this.lastQuery, str)) {
                    AndroidUtilities.runOnUIThread(new PhotoViewer$44$$ExternalSyntheticLambda0(21, this, tLObject));
                }
            }

            public void lambda$afterTextChanged$2(String str) {
                AddEmojiCell.this.lastQuery = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                AddEmojiCell addEmojiCell = AddEmojiCell.this;
                addEmojiCell.reqId = GroupStickersActivity.this.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new IntroActivity$$ExternalSyntheticLambda6(6, this, str), 66);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String strTrim = editable.toString().trim();
                if (AddEmojiCell.this.reqId != 0) {
                    GroupStickersActivity.this.getConnectionsManager().cancelRequest(AddEmojiCell.this.reqId, true);
                    AddEmojiCell.this.reqId = 0;
                }
                if (AddEmojiCell.this.lastCallback != null) {
                    AndroidUtilities.cancelRunOnUIThread(AddEmojiCell.this.lastCallback);
                }
                AddEmojiCell.this.lastQuery = null;
                if (strTrim.isEmpty()) {
                    GroupStickersActivity.this.selectSetAfterSearch(null);
                } else {
                    AndroidUtilities.runOnUIThread(AddEmojiCell.this.lastCallback = new PhotoViewer$44$$ExternalSyntheticLambda0(22, this, strTrim), 300L);
                }
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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

        public void bind(boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            this.needDivider = z;
            this.editText.removeTextChangedListener(this.textWatcher);
            if (tL_messages_stickerSet == null) {
                this.editText.setText("");
            } else {
                String str = tL_messages_stickerSet.set.short_name;
                this.editText.setText(str);
                this.editText.setSelection(str.length());
            }
            this.editText.addTextChangedListener(this.textWatcher);
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, Theme.dividerPaint);
            }
        }

        public void setNeedDivider(boolean z) {
            this.needDivider = z;
            invalidate();
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private static final int TYPE_CHOOSE_HEADER = 4;
        private static final int TYPE_ENTER_LINK = 5;
        private static final int TYPE_INFO = 1;
        private static final int TYPE_STICKER_SET = 0;
        private final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public void lambda$onBindViewHolder$0(View view) {
            GroupStickersActivity.this.selectSetAfterSearch(null);
        }

        @Override
        public int getItemCount() {
            return GroupStickersActivity.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            if ((i >= GroupStickersActivity.this.stickersStartRow && i < GroupStickersActivity.this.stickersEndRow) || i == GroupStickersActivity.this.currentEmojiPackRow) {
                return 0;
            }
            if (i == GroupStickersActivity.this.headerRow || i == GroupStickersActivity.this.addEmojiPackTitleRow) {
                return 4;
            }
            if (i == GroupStickersActivity.this.infoRow || i == GroupStickersActivity.this.addEmojiPackHintRow) {
                return 1;
            }
            return i == GroupStickersActivity.this.addEmojiPackRow ? 5 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                StickerSetCell stickerSetCell = (StickerSetCell) viewHolder.itemView;
                if (i == GroupStickersActivity.this.currentEmojiPackRow) {
                    stickerSetCell.setChecked(false, false);
                    stickerSetCell.setStickersSet(false, GroupStickersActivity.this.selectedStickerSet, false);
                    stickerSetCell.setDeleteAction(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 15));
                    return;
                }
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(((BaseFragment) GroupStickersActivity.this).currentAccount).getStickerSets(GroupStickersActivity.this.getStickerSetType());
                int i2 = i - GroupStickersActivity.this.stickersStartRow;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i2);
                stickerSetCell.setStickersSet(i2 != stickerSets.size() - 1, stickerSets.get(i2), false);
                stickerSetCell.setDeleteAction(null);
                if (GroupStickersActivity.this.selectedStickerSet != null) {
                    j = GroupStickersActivity.this.selectedStickerSet.set.id;
                } else {
                    GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
                    if (groupStickersActivity.getStickerSet(groupStickersActivity.info) != null) {
                        GroupStickersActivity groupStickersActivity2 = GroupStickersActivity.this;
                        j = groupStickersActivity2.getStickerSet(groupStickersActivity2.info).id;
                    } else {
                        j = 0;
                    }
                }
                stickerSetCell.setChecked(tL_messages_stickerSet.set.id == j, false);
                return;
            }
            if (itemViewType != 1) {
                if (itemViewType != 4) {
                    if (itemViewType != 5) {
                        return;
                    }
                    ((AddEmojiCell) viewHolder.itemView).bind(GroupStickersActivity.this.currentEmojiPackRow > 0, GroupStickersActivity.this.selectedStickerSet);
                    return;
                } else if (i == GroupStickersActivity.this.addEmojiPackTitleRow) {
                    ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString(GroupStickersActivity.this.isEmoji ? R.string.ChooseEmojiPackHeader : R.string.ChooseStickerSetHeader));
                    return;
                }
            }
            if (i != GroupStickersActivity.this.infoRow) {
                if (i == GroupStickersActivity.this.addEmojiPackHintRow) {
                    ((TextInfoPrivacyCell) viewHolder.itemView).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(GroupStickersActivity.this.isEmoji ? R.string.ChooseEmojiPackMy : R.string.ChooseStickerSetMy);
            String str = "@stickers";
            int iIndexOf = string.indexOf("@stickers");
            if (iIndexOf == -1) {
                ((TextInfoPrivacyCell) viewHolder.itemView).setText(string);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new URLSpanNoUnderline(str) {
                    @Override
                    public void onClick(View view) {
                        MessagesController.getInstance(((BaseFragment) GroupStickersActivity.this).currentAccount).openByUserName("stickers", GroupStickersActivity.this, 1);
                    }
                }, iIndexOf, iIndexOf + 9, 18);
                ((TextInfoPrivacyCell) viewHolder.itemView).setText(spannableStringBuilder);
            } catch (Exception e) {
                FileLog.e(e);
                ((TextInfoPrivacyCell) viewHolder.itemView).setText(string);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View stickerSetCell;
            if (i == 0) {
                stickerSetCell = new StickerSetCell(this.mContext, 3);
                stickerSetCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else if (i == 1) {
                stickerSetCell = new TextInfoPrivacyCell(this.mContext, 24, null);
                stickerSetCell.setBackground(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            } else if (i != 5) {
                stickerSetCell = new HeaderCell(this.mContext);
                stickerSetCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else {
                GroupStickersActivity.this.addEmojiCell = GroupStickersActivity.this.new AddEmojiCell(this.mContext);
                stickerSetCell = GroupStickersActivity.this.addEmojiCell;
            }
            stickerSetCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(stickerSetCell);
        }
    }

    public class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private static final int TYPE_MY_STICKERS_HEADER = 1;
        private static final int TYPE_STICKER_SET = 0;
        private Runnable lastCallback;
        private String lastQuery;
        private Context mContext;
        private int reqId;
        private List<TLRPC.TL_messages_stickerSet> searchEntries = new ArrayList();
        private List<TLRPC.TL_messages_stickerSet> localSearchEntries = new ArrayList();

        public SearchAdapter(Context context) {
            this.mContext = context;
            setHasStableIds(true);
        }

        private void changeBackgroundColor(String str) {
            if (GroupStickersActivity.this.isEmoji) {
                if (TextUtils.isEmpty(str)) {
                    GroupStickersActivity.this.listView.setBackground(null);
                } else {
                    GroupStickersActivity.this.listView.setBackgroundColor(GroupStickersActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                }
            }
        }

        public void lambda$onSearchStickers$0(List list, List list2, String str) {
            this.searchEntries = list;
            this.localSearchEntries = list2;
            notifyDataSetChanged();
            GroupStickersActivity.this.emptyView.title.setVisibility(8);
            GroupStickersActivity.this.emptyView.subtitle.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, str));
            GroupStickersActivity.this.emptyView.showProgress(false, true);
        }

        public void lambda$onSearchStickers$1(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
            if (Objects.equals(this.lastQuery, str) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
                ArrayList arrayList = new ArrayList();
                ArrayList<TLRPC.StickerSetCovered> arrayList2 = ((TLRPC.TL_messages_foundStickerSets) tLObject).sets;
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i2);
                    i2++;
                    TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                    tL_messages_stickerSet.set = stickerSetCovered2.set;
                    tL_messages_stickerSet.documents = stickerSetCovered2.covers;
                    if (!GroupStickersActivity.this.isEmoji || tL_messages_stickerSet.set.emojis) {
                        arrayList.add(tL_messages_stickerSet);
                    }
                }
                String strTrim = str2.toLowerCase(Locale.ROOT).trim();
                ArrayList arrayList3 = new ArrayList();
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(((BaseFragment) GroupStickersActivity.this).currentAccount).getStickerSets(GroupStickersActivity.this.getStickerSetType());
                int size2 = stickerSets.size();
                while (i < size2) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i);
                    i++;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = tL_messages_stickerSet2;
                    String str3 = tL_messages_stickerSet3.set.short_name;
                    Locale locale = Locale.ROOT;
                    if (str3.toLowerCase(locale).contains(strTrim) || tL_messages_stickerSet3.set.title.toLowerCase(locale).contains(strTrim)) {
                        arrayList3.add(tL_messages_stickerSet3);
                    }
                }
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda5(5, this, arrayList, arrayList3, str2));
            }
        }

        public void lambda$onSearchStickers$2(String str) {
            TLObject tLObject;
            this.lastQuery = str;
            if (GroupStickersActivity.this.isEmoji) {
                TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                tL_messages_searchEmojiStickerSets.q = str;
                tLObject = tL_messages_searchEmojiStickerSets;
            } else {
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
                tL_messages_searchStickerSets.q = str;
                tLObject = tL_messages_searchStickerSets;
            }
            this.reqId = GroupStickersActivity.this.getConnectionsManager().sendRequest(tLObject, new LinkManager$$ExternalSyntheticLambda0((Object) this, str, (Object) str, 2), 66);
        }

        public void onSearchStickers(String str) {
            changeBackgroundColor(str);
            if (this.reqId != 0) {
                GroupStickersActivity.this.getConnectionsManager().cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
            Runnable runnable = this.lastCallback;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.lastCallback = null;
            }
            this.lastQuery = null;
            int itemCount = getItemCount();
            if (itemCount > 0) {
                this.searchEntries.clear();
                this.localSearchEntries.clear();
                notifyItemRangeRemoved(0, itemCount);
            }
            if (TextUtils.isEmpty(str)) {
                GroupStickersActivity.this.emptyView.setVisibility(8);
                GroupStickersActivity.this.emptyView.showProgress(false, true);
                return;
            }
            if (GroupStickersActivity.this.emptyView.getVisibility() != 0) {
                GroupStickersActivity.this.emptyView.setVisibility(0);
                GroupStickersActivity.this.emptyView.showProgress(true, false);
            } else {
                GroupStickersActivity.this.emptyView.showProgress(true, true);
            }
            PhotoViewer$44$$ExternalSyntheticLambda0 photoViewer$44$$ExternalSyntheticLambda0 = new PhotoViewer$44$$ExternalSyntheticLambda0(23, this, str);
            this.lastCallback = photoViewer$44$$ExternalSyntheticLambda0;
            AndroidUtilities.runOnUIThread(photoViewer$44$$ExternalSyntheticLambda0, 300L);
        }

        @Override
        public int getItemCount() {
            return this.localSearchEntries.size() + this.searchEntries.size() + (!this.localSearchEntries.isEmpty() ? 1 : 0);
        }

        @Override
        public long getItemId(int i) {
            if (getItemViewType(i) != 0) {
                return -1L;
            }
            List<TLRPC.TL_messages_stickerSet> list = i > this.searchEntries.size() ? this.localSearchEntries : this.searchEntries;
            if (i > this.searchEntries.size()) {
                i = (i - this.searchEntries.size()) - 1;
            }
            return list.get(i).set.id;
        }

        @Override
        public int getItemViewType(int i) {
            return this.searchEntries.size() == i ? 1 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return getItemViewType(viewHolder.getAdapterPosition()) == 0;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            if (getItemViewType(i) != 0) {
                return;
            }
            boolean z = i > this.searchEntries.size();
            List<TLRPC.TL_messages_stickerSet> list = z ? this.localSearchEntries : this.searchEntries;
            if (z) {
                i = (i - this.searchEntries.size()) - 1;
            }
            StickerSetCell stickerSetCell = (StickerSetCell) viewHolder.itemView;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = list.get(i);
            stickerSetCell.setStickersSet(i != list.size() - 1, tL_messages_stickerSet, !z);
            String str = this.lastQuery;
            String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
            Theme.ResourcesProvider resourceProvider = GroupStickersActivity.this.getResourceProvider();
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
                StringBuilder sbM = DiffUtil.m(str3);
                sbM.append(stickerSet.short_name);
                SpannableString spannableString2 = new SpannableString(sbM.toString());
                spannableString2.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, resourceProvider), length, lowerCase.length() + length, 0);
                stickerSetCell.valueTextView.setText(spannableString2);
            }
            if (GroupStickersActivity.this.selectedStickerSet != null) {
                j = GroupStickersActivity.this.selectedStickerSet.set.id;
            } else {
                GroupStickersActivity groupStickersActivity = GroupStickersActivity.this;
                if (groupStickersActivity.getStickerSet(groupStickersActivity.info) != null) {
                    GroupStickersActivity groupStickersActivity2 = GroupStickersActivity.this;
                    j = groupStickersActivity2.getStickerSet(groupStickersActivity2.info).id;
                } else {
                    j = 0;
                }
            }
            stickerSetCell.setChecked(tL_messages_stickerSet.set.id == j, false);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i != 0) {
                HeaderCell headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteGrayText4, 21, 0, 0, false, false, GroupStickersActivity.this.getResourceProvider());
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(GroupStickersActivity.this.getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                combinedDrawable.setFullsize(true);
                headerCell.setBackground(combinedDrawable);
                headerCell.setText(LocaleController.getString(GroupStickersActivity.this.isEmoji ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
                view = headerCell;
            } else {
                StickerSetCell stickerSetCell = new StickerSetCell(this.mContext, 3);
                stickerSetCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                view = stickerSetCell;
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }
    }

    public GroupStickersActivity(long j) {
        super(null);
        this.selectedStickerSetIndex = -1;
        this.chatId = j;
    }

    public TLRPC.StickerSet getStickerSet(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        return this.isEmoji ? chatFull.emojiset : chatFull.stickerset;
    }

    public int getStickerSetType() {
        return this.isEmoji ? 5 : 0;
    }

    public void lambda$createView$0(View view, int i) {
        if (getParentActivity() == null) {
            return;
        }
        if (this.searching) {
            if (i > this.searchAdapter.searchEntries.size()) {
                onStickerSetClicked(((StickerSetCell) view).isChecked(), (TLRPC.TL_messages_stickerSet) this.searchAdapter.localSearchEntries.get((i - this.searchAdapter.searchEntries.size()) - 1), false);
                return;
            } else {
                if (i != this.searchAdapter.searchEntries.size()) {
                    onStickerSetClicked(((StickerSetCell) view).isChecked(), (TLRPC.TL_messages_stickerSet) this.searchAdapter.searchEntries.get(i), true);
                    return;
                }
                return;
            }
        }
        if (i >= this.stickersStartRow && i < this.stickersEndRow) {
            onStickerSetClicked(((StickerSetCell) view).isChecked(), MediaDataController.getInstance(this.currentAccount).getStickerSets(getStickerSetType()).get(i - this.stickersStartRow), false);
        }
        if (i == this.currentEmojiPackRow) {
            onStickerSetClicked(true, this.selectedStickerSet, false);
        }
    }

    public void lambda$saveStickerSet$1(TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (getParentActivity() != null) {
                Activity parentActivity = getParentActivity();
                StringBuilder sb = new StringBuilder();
                zzko.m(R.string.ErrorOccurred, "\n", sb);
                sb.append(tL_error.text);
                Toast.makeText(parentActivity, sb.toString(), 0).show();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.selectedStickerSet;
        if (tL_messages_stickerSet == null) {
            setStickerSet(null);
        } else {
            setStickerSet(tL_messages_stickerSet.set);
            MediaDataController.getInstance(this.currentAccount).putGroupStickerSet(this.selectedStickerSet);
        }
        updateSelectedStickerSetIndex();
        if (this.isEmoji) {
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
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(this.info.id), Boolean.valueOf(this.isEmoji));
        finishFragment();
    }

    public void lambda$saveStickerSet$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(11, this, tL_error));
    }

    private void onStickerSetClicked(boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z2) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        if (z2) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        StickersAlert stickersAlert = new StickersAlert(getParentActivity(), this, tL_inputStickerSetShortName, !z2 ? tL_messages_stickerSet : null, null, false);
        stickersAlert.setCustomButtonDelegate(new AnonymousClass4(z, tL_messages_stickerSet));
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        stickersAlert.show();
    }

    private void saveStickerSet() {
        TLObject tLObject;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull != null) {
            if (getStickerSet(chatFull) == null || (tL_messages_stickerSet = this.selectedStickerSet) == null || tL_messages_stickerSet.set.id != getStickerSet(this.info).id) {
                if (getStickerSet(this.info) == null && this.selectedStickerSet == null) {
                    return;
                }
                if (this.isEmoji) {
                    TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                    tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chatId);
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
                    tL_channels_setStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chatId);
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, new LinkManager$$ExternalSyntheticLambda10(this, 12));
            }
        }
    }

    public void selectSetAfterSearch(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i = this.selectedStickerSetIndex;
        if (tL_messages_stickerSet == null) {
            if (this.selectedStickerSet != null) {
                FactCheckController$$ExternalSyntheticOutline0.m(R.string.GroupsEmojiPackUpdated, BulletinFactory.of(this), R.raw.done);
            }
            this.selectedStickerSet = null;
            this.removeStickerSet = true;
        } else {
            this.selectedStickerSet = tL_messages_stickerSet;
            this.removeStickerSet = false;
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.GroupsEmojiPackUpdated, BulletinFactory.of(this), R.raw.done);
        }
        updateSelectedStickerSetIndex();
        updateCurrentPackVisibility(this.selectedStickerSet, false);
        if (i != -1) {
            if (this.searching) {
                this.listAdapter.lambda$onBindViewHolder$31(this.stickersStartRow + i);
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= this.listView.getChildCount()) {
                    this.listAdapter.lambda$onBindViewHolder$31(this.stickersStartRow + i);
                    break;
                }
                View childAt = this.listView.getChildAt(i2);
                if (this.listView.getChildViewHolder(childAt).getAdapterPosition() == this.stickersStartRow + i) {
                    ((StickerSetCell) childAt).setChecked(false, true);
                    break;
                }
                i2++;
            }
        }
        if (this.selectedStickerSetIndex != -1) {
            if (!this.searching) {
                for (int i3 = 0; i3 < this.listView.getChildCount(); i3++) {
                    View childAt2 = this.listView.getChildAt(i3);
                    if (this.listView.getChildViewHolder(childAt2).getAdapterPosition() == this.stickersStartRow + this.selectedStickerSetIndex) {
                        ((StickerSetCell) childAt2).setChecked(true, true);
                        return;
                    }
                }
            }
            this.listAdapter.lambda$onBindViewHolder$31(this.stickersStartRow + this.selectedStickerSetIndex);
        }
    }

    private void setStickerSet(TLRPC.StickerSet stickerSet) {
        if (this.isEmoji) {
            this.info.emojiset = stickerSet;
        } else {
            this.info.stickerset = stickerSet;
        }
    }

    public void updateCurrentPackVisibility(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z) {
        if (this.isEmoji) {
            if (tL_messages_stickerSet != null) {
                boolean z2 = this.currentEmojiPackRow == -1;
                this.selectedStickerSet = tL_messages_stickerSet;
                updateRows(false);
                if (z2) {
                    this.listAdapter.notifyItemInserted(this.currentEmojiPackRow);
                } else {
                    this.listAdapter.lambda$onBindViewHolder$31(this.currentEmojiPackRow);
                }
                if (z) {
                    this.listAdapter.lambda$onBindViewHolder$31(this.addEmojiPackRow);
                }
                this.addEmojiCell.setNeedDivider(true);
                return;
            }
            int i = this.currentEmojiPackRow;
            boolean z3 = i > 0;
            this.selectedStickerSet = null;
            if (z3) {
                this.listAdapter.notifyItemRemoved(i);
                if (z) {
                    this.listAdapter.lambda$onBindViewHolder$31(this.addEmojiPackRow);
                }
            }
            updateRows(false);
            this.addEmojiCell.setNeedDivider(false);
        }
    }

    private void updateRows() {
        updateRows(true);
    }

    public void updateSelectedStickerSetIndex() {
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

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(this.isEmoji ? R.string.GroupEmojiPack : R.string.GroupStickers));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    GroupStickersActivity.this.finishFragment();
                }
            }
        });
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
        this.searchItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchCollapse() {
                if (GroupStickersActivity.this.searching) {
                    GroupStickersActivity.this.searchAdapter.onSearchStickers(null);
                    GroupStickersActivity.this.searching = false;
                    GroupStickersActivity.this.listView.setAdapter(GroupStickersActivity.this.listAdapter);
                }
            }

            @Override
            public void onSearchExpand() {
            }

            @Override
            public void onTextChanged(EditText editText) {
                String string = editText.getText().toString();
                GroupStickersActivity.this.searchAdapter.onSearchStickers(string);
                boolean z = !TextUtils.isEmpty(string);
                if (z != GroupStickersActivity.this.searching) {
                    GroupStickersActivity.this.searching = z;
                    if (GroupStickersActivity.this.listView != null) {
                        GroupStickersActivity.this.listView.setAdapter(GroupStickersActivity.this.searching ? GroupStickersActivity.this.searchAdapter : GroupStickersActivity.this.listAdapter);
                    }
                }
            }
        });
        this.searchItem.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.listAdapter = new ListAdapter(context);
        this.searchAdapter = new SearchAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        this.listView = new RecyclerListView(context);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(200L);
        defaultItemAnimator.setSupportsChangeAnimations(true);
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
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
        this.emptyFrameView.addView(this.loadingView, LayoutHelper.createFrame(-1, -1.0f));
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, this.loadingView, 1);
        this.emptyView = stickerEmptyView;
        VerticalPositionAutoAnimator.attach(stickerEmptyView);
        this.emptyFrameView.addView(this.emptyView);
        frameLayout.addView(this.emptyFrameView);
        this.emptyFrameView.setVisibility(8);
        this.listView.setEmptyView(this.emptyFrameView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 19));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    AndroidUtilities.hideKeyboard(GroupStickersActivity.this.getParentActivity().getCurrentFocus());
                }
            }
        });
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == getStickerSetType()) {
                updateRows();
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
                updateRows();
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
            updateRows();
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
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

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(getStickerSetType());
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        updateRows();
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        if (this.selectedStickerSet != null || this.removeStickerSet) {
            saveStickerSet();
        }
    }

    public void setInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
        if (getStickerSet(chatFull) != null) {
            this.selectedStickerSet = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(getStickerSet(this.info));
        }
    }

    private void updateRows(boolean z) {
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
        listAdapter.notifyDataSetChanged();
    }

    public GroupStickersActivity(long j, boolean z) {
        super(null);
        this.selectedStickerSetIndex = -1;
        this.chatId = j;
        this.isEmoji = z;
    }
}
