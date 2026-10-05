package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public abstract class b {
    public static boolean f34997a;

    public static boolean a(int i10, TLRPC.User user) {
        String publicUsername;
        if (user == null || (publicUsername = UserObject.getPublicUsername(user)) == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("t\\.me/([a-zA-Z0-9]+)/?").matcher(MessagesController.getInstance(i10).freezeAppealUrl);
            if (matcher.find()) {
                if (publicUsername.equalsIgnoreCase(matcher.group(1))) {
                    return true;
                }
            }
            return false;
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
    }

    public static void b(int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        if (!f34997a && UserConfig.selectedAccount == i10) {
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context == null) {
                return;
            }
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                d6Var = U.getResourceProvider();
            } else {
                d6Var = null;
            }
            c(context, i10, d6Var);
        }
    }

    public static void c(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        if (f34997a) {
            return;
        }
        org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.bi.i(1, context, d6Var, false);
        ai.s1 s1Var = new ai.s1(i10, context, r5, 21);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        e7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e7.setClipChildren(false);
        e7.setClipToPadding(false);
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.media_forbidden, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        e7.addView((View) imageView, w7.z5.t(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        org.telegram.messenger.bi.j(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
        org.telegram.messenger.bi.k(R.string.AccountFrozenTitle, textView, 17);
        e7.addView(textView, w7.z5.t(-1, -2, 17, 0, 0, 0, 23));
        yh.s sVar = new yh.s(context, 1, d6Var);
        sVar.a(LocaleController.getString(R.string.AccountFrozen1Title), LocaleController.getString(R.string.AccountFrozen1Text), R.drawable.msg_block2);
        e7.addView(sVar, w7.z5.t(-1, -2, 17, 0, 0, 0, 0));
        yh.s sVar2 = new yh.s(context, 1, d6Var);
        sVar2.a(LocaleController.getString(R.string.AccountFrozen2Title), LocaleController.getString(R.string.AccountFrozen2Text), R.drawable.menu_privacy);
        e7.addView(sVar2, w7.z5.t(-1, -2, 17, 0, 0, 0, 0));
        yh.s sVar3 = new yh.s(context, 1, d6Var);
        sVar3.a(LocaleController.getString(R.string.AccountFrozen3Title), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.AccountFrozen3Text, LocaleController.formatYearMonthDay(MessagesController.getInstance(i10).freezeUntilDate, true)), new hu0(s1Var, 2)), R.drawable.menu_feature_hourglass);
        e7.addView(sVar3, w7.z5.t(-1, -2, 17, 0, 0, 0, 0));
        ci.d dVar = new ci.d(context, d6Var, true);
        dVar.g(LocaleController.getString(R.string.AccountFrozenButtonAppeal), false, true);
        dVar.setOnClickListener(new a(s1Var, 0));
        e7.addView(dVar, w7.z5.t(-1, 48, 7, 0, 13, 0, 4));
        ci.d dVar2 = new ci.d(context, d6Var, false);
        dVar2.g(LocaleController.getString(R.string.AccountFrozenButtonUnderstood), false, true);
        dVar2.setOnClickListener(new a(r5, 1));
        e7.addView(dVar2, w7.z5.t(-1, 48, 7, 0, 0, 0, 0));
        i11.customView = e7;
        org.telegram.ui.ActionBar.f3[] f3VarArr = {i11};
        i11.useBackgroundTopPadding = false;
        i11.fixNavigationBar();
        f34997a = true;
        f3VarArr[0].show();
        f3VarArr[0].setOnDismissListener(new ci.f1(1));
    }
}
