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
    public static boolean f32224a;

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
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static void b(int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (!f32224a && UserConfig.selectedAccount == i10) {
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context == null) {
                return;
            }
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                f6Var = U.getResourceProvider();
            } else {
                f6Var = null;
            }
            c(context, i10, f6Var);
        }
    }

    public static void c(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        if (f32224a) {
            return;
        }
        org.telegram.ui.ActionBar.f3 j3 = org.telegram.messenger.rk.j(1, context, f6Var, false);
        ai.s1 s1Var = new ai.s1(i10, context, r5, 21);
        LinearLayout f7 = org.telegram.messenger.rk.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.media_forbidden, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        f7.addView((View) imageView, w7.y5.t(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        org.telegram.messenger.rk.k(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        org.telegram.messenger.rk.l(R.string.AccountFrozenTitle, textView, 17);
        f7.addView(textView, w7.y5.t(-1, -2, 17, 0, 0, 0, 23));
        yh.r rVar = new yh.r(context, 1, f6Var);
        rVar.a(LocaleController.getString(R.string.AccountFrozen1Title), LocaleController.getString(R.string.AccountFrozen1Text), R.drawable.msg_block2);
        f7.addView(rVar, w7.y5.t(-1, -2, 17, 0, 0, 0, 0));
        yh.r rVar2 = new yh.r(context, 1, f6Var);
        rVar2.a(LocaleController.getString(R.string.AccountFrozen2Title), LocaleController.getString(R.string.AccountFrozen2Text), R.drawable.menu_privacy);
        f7.addView(rVar2, w7.y5.t(-1, -2, 17, 0, 0, 0, 0));
        yh.r rVar3 = new yh.r(context, 1, f6Var);
        rVar3.a(LocaleController.getString(R.string.AccountFrozen3Title), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.AccountFrozen3Text, LocaleController.formatYearMonthDay(MessagesController.getInstance(i10).freezeUntilDate, true)), new mu0(s1Var, 2)), R.drawable.menu_feature_hourglass);
        f7.addView(rVar3, w7.y5.t(-1, -2, 17, 0, 0, 0, 0));
        ci.d dVar = new ci.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.AccountFrozenButtonAppeal), false, true);
        dVar.setOnClickListener(new a(s1Var, 0));
        f7.addView(dVar, w7.y5.t(-1, 48, 7, 0, 13, 0, 4));
        ci.d dVar2 = new ci.d(context, f6Var, false);
        dVar2.g(LocaleController.getString(R.string.AccountFrozenButtonUnderstood), false, true);
        dVar2.setOnClickListener(new a(r5, 1));
        f7.addView(dVar2, w7.y5.t(-1, 48, 7, 0, 0, 0, 0));
        j3.customView = f7;
        org.telegram.ui.ActionBar.f3[] f3VarArr = {j3};
        j3.useBackgroundTopPadding = false;
        j3.fixNavigationBar();
        f32224a = true;
        f3VarArr[0].show();
        f3VarArr[0].setOnDismissListener(new ci.f1(1));
    }
}
