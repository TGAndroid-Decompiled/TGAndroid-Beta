package org.telegram.ui.Business;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
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
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.web.HistoryFragment;

public final class TimezoneSelector extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public String currentTimezone;
    public LinearLayout emptyView;
    public UniversalRecyclerView listView;
    public String query;
    public boolean searching;
    public String systemTimezone;
    public boolean useSystem;
    public GiftSheet$$ExternalSyntheticLambda4 whenTimezoneSelected;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 8));
        this.actionBar.createMenu().addItem(1, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public final void onSearchCollapse() {
                TimezoneSelector timezoneSelector = TimezoneSelector.this;
                timezoneSelector.searching = false;
                timezoneSelector.query = null;
                timezoneSelector.listView.adapter.update(true);
                timezoneSelector.listView.scrollToPosition(0);
            }

            @Override
            public final void onSearchExpand() {
                TimezoneSelector timezoneSelector = TimezoneSelector.this;
                timezoneSelector.searching = true;
                timezoneSelector.listView.adapter.update(true);
                timezoneSelector.listView.scrollToPosition(0);
            }

            @Override
            public final void onTextChanged(EditText editText) {
                String string = editText.getText().toString();
                TimezoneSelector timezoneSelector = TimezoneSelector.this;
                timezoneSelector.query = string;
                timezoneSelector.listView.adapter.update(true);
                timezoneSelector.listView.scrollToPosition(0);
            }
        }).setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new GiftSheet$$ExternalSyntheticLambda8(this, 10), new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 15), null);
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnScrollListener(new StarGiftSheet.AnonymousClass8(this, 4));
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
            arrayList.add(UItem.asRippleCheck(-1, LocaleController.getString(R.string.TimezoneDetectAutomatically)).setChecked(this.useSystem));
            universalAdapter.whiteSectionEnd();
            arrayList.add(UItem.asShadow(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, timezonesController.getTimezoneName(this.currentTimezone, true))));
        }
        universalAdapter.whiteSectionStart();
        if (!z2) {
            zzke.m(R.string.TimezoneHeader, arrayList);
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
            CharSequence timezoneName = TimezonesController.getTimezoneName(tL_timezone, false);
            if (z2) {
                String strReplace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(this.query).toLowerCase();
                if (SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase, strReplace) || strReplace.startsWith(lowerCase)) {
                    timezoneName = AndroidUtilities.highlightText(timezoneName, this.query, this.resourceProvider);
                    UItem checked = UItem.asRadio(i, timezoneName, TimezonesController.getTimezoneOffsetName(tL_timezone)).setChecked(TextUtils.equals(tL_timezone.id, this.currentTimezone));
                    if (this.useSystem || z2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(checked.setEnabled(z));
                    z3 = false;
                }
            } else {
                UItem checked2 = UItem.asRadio(i, timezoneName, TimezonesController.getTimezoneOffsetName(tL_timezone)).setChecked(TextUtils.equals(tL_timezone.id, this.currentTimezone));
                if (this.useSystem) {
                    z = true;
                } else {
                    z = true;
                }
                arrayList.add(checked2.setEnabled(z));
                z3 = false;
            }
            i++;
        }
        universalAdapter.whiteSectionEnd();
        if (z3) {
            arrayList.add(UItem.asCustomShadow(this.emptyView));
        } else {
            arrayList.add(UItem.asShadow(null));
        }
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
                GiftSheet$$ExternalSyntheticLambda4 giftSheet$$ExternalSyntheticLambda4 = this.whenTimezoneSelected;
                if (giftSheet$$ExternalSyntheticLambda4 != null) {
                    giftSheet$$ExternalSyntheticLambda4.run(str);
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
                GiftSheet$$ExternalSyntheticLambda4 giftSheet$$ExternalSyntheticLambda5 = this.whenTimezoneSelected;
                if (giftSheet$$ExternalSyntheticLambda5 != null) {
                    giftSheet$$ExternalSyntheticLambda5.run(str2);
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
