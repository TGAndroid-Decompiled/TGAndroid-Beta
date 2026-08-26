package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EditTextSettingsCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

public final class QuickRepliesSettingsActivity extends BaseFragment {
    public int explanationRow;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public int reply2Row;
    public int reply3Row;
    public int reply4Row;
    public int rowCount;
    public final EditTextSettingsCell[] textCells;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return QuickRepliesSettingsActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            QuickRepliesSettingsActivity quickRepliesSettingsActivity = QuickRepliesSettingsActivity.this;
            if (i == quickRepliesSettingsActivity.explanationRow) {
                return 0;
            }
            if (i == 0 || i == quickRepliesSettingsActivity.reply2Row || i == quickRepliesSettingsActivity.reply3Row || i == quickRepliesSettingsActivity.reply4Row) {
                return i + 9;
            }
            return 1;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            if (adapterPosition == 0) {
                return true;
            }
            QuickRepliesSettingsActivity quickRepliesSettingsActivity = QuickRepliesSettingsActivity.this;
            return adapterPosition == quickRepliesSettingsActivity.reply2Row || adapterPosition == quickRepliesSettingsActivity.reply3Row || adapterPosition == quickRepliesSettingsActivity.reply4Row;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            String str;
            int i2 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                textInfoPrivacyCell.setText(LocaleController.getString(R.string.VoipQuickRepliesExplain));
                return;
            }
            if (i2 == 1) {
                return;
            }
            QuickRepliesSettingsActivity quickRepliesSettingsActivity = QuickRepliesSettingsActivity.this;
            if (i2 == 4) {
                ((TextCheckCell) view).setTextAndCheck(LocaleController.getString(R.string.AllowCustomQuickReply), quickRepliesSettingsActivity.getParentActivity().getSharedPreferences("mainconfig", 0).getBoolean("quick_reply_allow_custom", true), false);
                return;
            }
            switch (i2) {
                case 9:
                case 10:
                case 11:
                case 12:
                    EditTextSettingsCell editTextSettingsCell = (EditTextSettingsCell) view;
                    if (i == 0) {
                        string = LocaleController.getString(R.string.QuickReplyDefault1);
                        str = "quick_reply_msg1";
                    } else if (i == quickRepliesSettingsActivity.reply2Row) {
                        string = LocaleController.getString(R.string.QuickReplyDefault2);
                        str = "quick_reply_msg2";
                    } else if (i == quickRepliesSettingsActivity.reply3Row) {
                        string = LocaleController.getString(R.string.QuickReplyDefault3);
                        str = "quick_reply_msg3";
                    } else if (i == quickRepliesSettingsActivity.reply4Row) {
                        string = LocaleController.getString(R.string.QuickReplyDefault4);
                        str = "quick_reply_msg4";
                    } else {
                        string = null;
                        str = null;
                    }
                    String string2 = quickRepliesSettingsActivity.getParentActivity().getSharedPreferences("mainconfig", 0).getString(str, "");
                    boolean z = i != quickRepliesSettingsActivity.reply4Row;
                    editTextSettingsCell.textView.setText(string2);
                    editTextSettingsCell.textView.setHint(string);
                    editTextSettingsCell.needDivider = z;
                    editTextSettingsCell.setWillNotDraw(!z);
                    break;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textInfoPrivacyCell;
            Context context = this.mContext;
            if (i == 0) {
                textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
            } else if (i != 1) {
                switch (i) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        EditTextSettingsCell editTextSettingsCell = new EditTextSettingsCell(context);
                        editTextSettingsCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                        QuickRepliesSettingsActivity.this.textCells[i - 9] = editTextSettingsCell;
                        textInfoPrivacyCell = editTextSettingsCell;
                        break;
                    default:
                        textInfoPrivacyCell = new TextCheckCell(context);
                        textInfoPrivacyCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                        break;
                }
            } else {
                textInfoPrivacyCell = new TextSettingsCell(context, 0, null);
                textInfoPrivacyCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            }
            textInfoPrivacyCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(textInfoPrivacyCell);
        }
    }

    public QuickRepliesSettingsActivity() {
        super(null);
        this.textCells = new EditTextSettingsCell[4];
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.VoipQuickReplies));
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 18));
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.listView.setVerticalScrollBarEnabled(false);
        zzku.m(this.listView);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.actionBar.setAdaptiveBackground(this.listView);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{TextSettingsCell.class, TextCheckCell.class, EditTextSettingsCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{EditTextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 8388608, new Class[]{EditTextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteHintText));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.reply2Row = 1;
        this.reply3Row = 2;
        this.reply4Row = 3;
        this.rowCount = 5;
        this.explanationRow = 4;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i = 0;
        SharedPreferences.Editor editorEdit = getParentActivity().getSharedPreferences("mainconfig", 0).edit();
        while (true) {
            EditTextSettingsCell[] editTextSettingsCellArr = this.textCells;
            if (i >= editTextSettingsCellArr.length) {
                editorEdit.commit();
                return;
            }
            EditTextSettingsCell editTextSettingsCell = editTextSettingsCellArr[i];
            if (editTextSettingsCell != null) {
                String string = editTextSettingsCell.getTextView().getText().toString();
                if (TextUtils.isEmpty(string)) {
                    editorEdit.remove("quick_reply_msg" + (i + 1));
                } else {
                    editorEdit.putString("quick_reply_msg" + (i + 1), string);
                }
            }
            i++;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }
}
