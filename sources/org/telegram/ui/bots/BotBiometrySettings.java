package org.telegram.ui.bots;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
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
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;

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
        zzkt.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new UserInfoActivity.AnonymousClass4(this, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourceProvider));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(getParentActivity(), getCurrentAccount(), getClassGuid(), new TodoItemMenu$$ExternalSyntheticLambda17(this, 9), new BotBiometrySettings$$ExternalSyntheticLambda1(this), new BotBiometrySettings$$ExternalSyntheticLambda1(this), getResourceProvider());
        this.listView = universalRecyclerView;
        frameLayout.addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1, 119));
        BotBiometry.getBots(getParentActivity(), this.currentAccount, new VoIPFragment$$ExternalSyntheticLambda7(this, 24));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void fillItems$53(ArrayList arrayList) {
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.biometryBots;
            if (i >= arrayList2.size()) {
                String string = LocaleController.getString(R.string.PrivacyBiometryBotsInfo);
                UItem uItem = new UItem(7);
                uItem.text = string;
                arrayList.add(uItem);
                return;
            }
            BotBiometry.Bot bot = (BotBiometry.Bot) arrayList2.get(i);
            HashMap map = this.botName;
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) map.get(bot);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                AvatarSpan avatarSpan = new AvatarSpan(null, 24.0f, this.currentAccount);
                avatarSpan.setUser(bot.user);
                spannableStringBuilder.setSpan(avatarSpan, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(bot.user));
                map.put(bot, spannableStringBuilder);
            }
            UItem uItemAsCheck = UItem.asCheck(i, spannableStringBuilder);
            uItemAsCheck.setChecked(!bot.disabled);
            arrayList.add(uItemAsCheck);
            i++;
        }
    }

    public final void onClick$18(UItem uItem) {
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
        Activity parentActivity = getParentActivity();
        int i2 = this.currentAccount;
        long j = bot.user.id;
        boolean z = bot.disabled;
        WeakHashMap weakHashMap = BotBiometry.instances;
        SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i2, 0);
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
