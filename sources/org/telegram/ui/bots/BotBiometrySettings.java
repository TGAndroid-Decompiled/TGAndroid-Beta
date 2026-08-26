package org.telegram.ui.bots;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda53;
import org.telegram.ui.web.HistoryFragment;

public final class BotBiometrySettings extends BaseFragment {
    public final ArrayList biometryBots;
    public final HashMap botName;
    public UniversalRecyclerView listView;

    public BotBiometrySettings() {
        super(null);
        this.biometryBots = new ArrayList();
        this.botName = new HashMap();
    }

    @Override
    public final View createView(Context context) {
        zzki.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourceProvider));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new BotDownloads$$ExternalSyntheticLambda0(this, 9), new BotBiometrySettings$$ExternalSyntheticLambda1(this), new BotBiometrySettings$$ExternalSyntheticLambda1(this));
        this.listView = universalRecyclerView;
        frameLayout.addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1, 119));
        BotBiometry.getBots(getContext(), this.currentAccount, new RichEditor$$ExternalSyntheticLambda53(this, 8));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void fillItems$33(ArrayList arrayList) {
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.biometryBots;
            if (i >= arrayList2.size()) {
                zzkf.m(R.string.PrivacyBiometryBotsInfo, arrayList);
                return;
            }
            BotBiometry.Bot bot = (BotBiometry.Bot) arrayList2.get(i);
            HashMap map = this.botName;
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) map.get(bot);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                AvatarSpan avatarSpan = new AvatarSpan(null, this.currentAccount, 24.0f);
                avatarSpan.setUser(bot.user);
                spannableStringBuilder.setSpan(avatarSpan, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(bot.user));
                map.put(bot, spannableStringBuilder);
            }
            arrayList.add(UItem.asCheck(i, spannableStringBuilder).setChecked(!bot.disabled));
            i++;
        }
    }

    public final void onClick$13(UItem uItem) {
        int i;
        UniversalAdapter universalAdapter;
        if (uItem.viewType != 4 || (i = uItem.id) < 0) {
            return;
        }
        ArrayList arrayList = this.biometryBots;
        if (i >= arrayList.size()) {
            return;
        }
        BotBiometry.Bot bot = (BotBiometry.Bot) arrayList.get(uItem.id);
        bot.disabled = !bot.disabled;
        Context context = getContext();
        int i2 = this.currentAccount;
        long j = bot.user.id;
        boolean z = bot.disabled;
        WeakHashMap weakHashMap = BotBiometry.instances;
        SharedPreferences sharedPreferences = context.getSharedPreferences("2botbiometry_" + i2, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(j + "_disabled", z);
        if (!z && sharedPreferences.getString(String.valueOf(j), null) == null) {
            editorEdit.putString(String.valueOf(j), "");
        }
        editorEdit.apply();
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || (universalAdapter = universalRecyclerView.adapter) == null) {
            return;
        }
        universalAdapter.update(true);
    }
}
