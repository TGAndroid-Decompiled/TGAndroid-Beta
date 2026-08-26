package org.telegram.ui.Business;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.CallLogActivity;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.TopicsFragment;

public final class TimezoneSelector extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public String currentTimezone;
    public LinearLayout emptyView;
    public UniversalRecyclerView listView;
    public String query;
    public boolean searching;
    public String systemTimezone;
    public boolean useSystem;
    public ArticleViewer$$ExternalSyntheticLambda21 whenTimezoneSelected;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 12));
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(1, R.drawable.outline_header_search);
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 1);
        actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(getParentActivity(), getCurrentAccount(), getClassGuid(), new CallLogActivity$$ExternalSyntheticLambda3(this, 11), new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 24), null, getResourceProvider());
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.emptyView = linearLayout;
        linearLayout.setOrientation(1);
        this.emptyView.setMinimumHeight(AndroidUtilities.dp(500.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(backupImageView, "RestrictedEmoji", "🌖", "130_130");
        this.emptyView.addView(backupImageView, LayoutHelper.createLinear(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        OKLCH.m(Theme.key_windowBackgroundWhiteGrayText, this.resourceProvider, textView, 15.0f);
        this.emptyView.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalRecyclerView universalRecyclerView;
        UniversalAdapter universalAdapter;
        if (i != NotificationCenter.timezonesUpdated || (universalRecyclerView = this.listView) == null || (universalAdapter = universalRecyclerView.adapter) == null) {
            return;
        }
        universalAdapter.update(true);
    }

    public final void fillItems$6(ArrayList arrayList, UniversalAdapter universalAdapter) {
        boolean z;
        boolean z2 = this.searching && !TextUtils.isEmpty(this.query);
        TimezonesController timezonesController = TimezonesController.getInstance(this.currentAccount);
        if (!z2) {
            universalAdapter.whiteSectionStart();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            UItem uItem = new UItem(9);
            uItem.id = -1;
            uItem.text = string;
            uItem.setChecked(this.useSystem);
            arrayList.add(uItem);
            universalAdapter.whiteSectionEnd();
            String string2 = LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, timezonesController.getTimezoneName(this.currentTimezone, true));
            UItem uItem2 = new UItem(7);
            uItem2.text = string2;
            arrayList.add(uItem2);
        }
        universalAdapter.whiteSectionStart();
        if (!z2) {
            String string3 = LocaleController.getString(R.string.TimezoneHeader);
            UItem uItem3 = new UItem(0);
            uItem3.text = string3;
            arrayList.add(uItem3);
        }
        int i = 0;
        boolean z3 = true;
        while (true) {
            timezonesController.load();
            ArrayList arrayList2 = timezonesController.timezones;
            if (i >= arrayList2.size()) {
                break;
            }
            timezonesController.load();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i);
            CharSequence charSequenceHighlightText = tL_timezone != null ? tL_timezone.name : null;
            if (z2) {
                String strReplace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(this.query).toLowerCase();
                if (SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase, strReplace) || strReplace.startsWith(lowerCase)) {
                    charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceHighlightText, this.query, this.resourceProvider);
                    String timezoneOffsetName = TimezonesController.getTimezoneOffsetName(tL_timezone);
                    UItem uItem4 = new UItem(10);
                    uItem4.id = i;
                    uItem4.text = charSequenceHighlightText;
                    uItem4.textValue = timezoneOffsetName;
                    uItem4.setChecked(TextUtils.equals(tL_timezone.id, this.currentTimezone));
                    if (this.useSystem || z2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    uItem4.enabled = z;
                    arrayList.add(uItem4);
                    z3 = false;
                }
            } else {
                String timezoneOffsetName2 = TimezonesController.getTimezoneOffsetName(tL_timezone);
                UItem uItem5 = new UItem(10);
                uItem5.id = i;
                uItem5.text = charSequenceHighlightText;
                uItem5.textValue = timezoneOffsetName2;
                uItem5.setChecked(TextUtils.equals(tL_timezone.id, this.currentTimezone));
                if (this.useSystem) {
                    z = true;
                } else {
                    z = true;
                }
                uItem5.enabled = z;
                arrayList.add(uItem5);
                z3 = false;
            }
            i++;
        }
        universalAdapter.whiteSectionEnd();
        if (z3) {
            arrayList.add(UItem.asCustomShadow(this.emptyView));
            return;
        }
        UItem uItem6 = new UItem(7);
        uItem6.text = null;
        arrayList.add(uItem6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void onClick$6(UItem uItem, View view) {
        if (uItem.id == -1) {
            boolean z = this.useSystem;
            this.useSystem = !z;
            if (!z) {
                String str = this.systemTimezone;
                this.currentTimezone = str;
                ArticleViewer$$ExternalSyntheticLambda21 articleViewer$$ExternalSyntheticLambda21 = this.whenTimezoneSelected;
                if (articleViewer$$ExternalSyntheticLambda21 != null) {
                    articleViewer$$ExternalSyntheticLambda21.run(str);
                }
            }
            ((TextCheckCell) view).setChecked(this.useSystem);
            this.listView.adapter.update(true);
            return;
        }
        if (view.isEnabled()) {
            TimezonesController timezonesController = TimezonesController.getInstance(this.currentAccount);
            int i = uItem.id;
            if (i >= 0) {
                timezonesController.load();
                ArrayList arrayList = timezonesController.timezones;
                if (i >= arrayList.size()) {
                    return;
                }
                timezonesController.load();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(uItem.id);
                this.useSystem = false;
                String str2 = tL_timezone.id;
                this.currentTimezone = str2;
                ArticleViewer$$ExternalSyntheticLambda21 articleViewer$$ExternalSyntheticLambda22 = this.whenTimezoneSelected;
                if (articleViewer$$ExternalSyntheticLambda22 != null) {
                    articleViewer$$ExternalSyntheticLambda22.run(str2);
                }
                if (this.searching) {
                    this.actionBar.closeSearchField(true);
                }
                this.listView.adapter.update(true);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        String systemTimezoneId = TimezonesController.getInstance(this.currentAccount).getSystemTimezoneId();
        this.systemTimezone = systemTimezoneId;
        this.useSystem = TextUtils.equals(systemTimezoneId, this.currentTimezone);
        getNotificationCenter().addObserver(this, NotificationCenter.timezonesUpdated);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.timezonesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
