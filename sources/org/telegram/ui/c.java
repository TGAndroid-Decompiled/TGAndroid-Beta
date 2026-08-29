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
public abstract class c {
    public static boolean f36947a;

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
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    public static void b(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        if (!f36947a && UserConfig.selectedAccount == i10) {
            Context context = LaunchActivity.C1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context == null) {
                return;
            }
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                c6Var = U.getResourceProvider();
            } else {
                c6Var = null;
            }
            c(context, i10, c6Var);
        }
    }

    public static void c(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        if (f36947a) {
            return;
        }
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
        ag.v0 v0Var = new ag.v0(i10, context, r5, 21);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.media_forbidden, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        g10.addView((View) imageView, i7.f6.t(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        b.g(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        b.i(R.string.AccountFrozenTitle, textView, 17);
        g10.addView(textView, i7.f6.t(-1, -2, 17, 0, 0, 0, 23));
        jh.e0 e0Var = new jh.e0(context, 1, c6Var);
        e0Var.a(LocaleController.getString(R.string.AccountFrozen1Title), LocaleController.getString(R.string.AccountFrozen1Text), R.drawable.msg_block2);
        g10.addView(e0Var, i7.f6.t(-1, -2, 17, 0, 0, 0, 0));
        jh.e0 e0Var2 = new jh.e0(context, 1, c6Var);
        e0Var2.a(LocaleController.getString(R.string.AccountFrozen2Title), LocaleController.getString(R.string.AccountFrozen2Text), R.drawable.menu_privacy);
        g10.addView(e0Var2, i7.f6.t(-1, -2, 17, 0, 0, 0, 0));
        jh.e0 e0Var3 = new jh.e0(context, 1, c6Var);
        e0Var3.a(LocaleController.getString(R.string.AccountFrozen3Title), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.AccountFrozen3Text, LocaleController.formatYearMonthDay(MessagesController.getInstance(i10).freezeUntilDate, true)), new it0(v0Var, 2)), R.drawable.menu_feature_hourglass);
        g10.addView(e0Var3, i7.f6.t(-1, -2, 17, 0, 0, 0, 0));
        nh.d dVar = new nh.d(context, c6Var, true);
        dVar.g(LocaleController.getString(R.string.AccountFrozenButtonAppeal), false, true);
        dVar.setOnClickListener(new a(v0Var, 0));
        g10.addView(dVar, i7.f6.t(-1, 48, 7, 0, 13, 0, 4));
        nh.d dVar2 = new nh.d(context, c6Var, false);
        dVar2.g(LocaleController.getString(R.string.AccountFrozenButtonUnderstood), false, true);
        dVar2.setOnClickListener(new a(r5, 1));
        g10.addView(dVar2, i7.f6.t(-1, 48, 7, 0, 0, 0, 0));
        q6.customView = g10;
        org.telegram.ui.ActionBar.f3[] f3VarArr = {q6};
        q6.useBackgroundTopPadding = false;
        q6.fixNavigationBar();
        f36947a = true;
        f3VarArr[0].show();
        f3VarArr[0].setOnDismissListener(new bg.f0(2));
    }
}
