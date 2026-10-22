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
    public static boolean f35464a;

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
        org.telegram.ui.ActionBar.d6 d6Var;
        if (!f35464a && UserConfig.selectedAccount == i10) {
            Context context = LaunchActivity.H1;
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
        if (f35464a) {
            return;
        }
        org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.ok.i(1, context, d6Var, false);
        ah.o oVar = new ah.o(i10, context, r5, 26);
        LinearLayout e = org.telegram.messenger.ok.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.media_forbidden, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        e.addView((View) imageView, w7.z5.t(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        org.telegram.messenger.ok.k(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        org.telegram.messenger.ok.m(R.string.AccountFrozenTitle, textView, 17);
        e.addView(textView, w7.z5.t(-1, -2, 17, 0, 0, 0, 23));
        ai.n0 n0Var = new ai.n0(context, 1, d6Var);
        n0Var.a(LocaleController.getString(R.string.AccountFrozen1Title), LocaleController.getString(R.string.AccountFrozen1Text), R.drawable.msg_block2);
        e.addView(n0Var, w7.z5.t(-1, -2, 17, 0, 0, 0, 0));
        ai.n0 n0Var2 = new ai.n0(context, 1, d6Var);
        n0Var2.a(LocaleController.getString(R.string.AccountFrozen2Title), LocaleController.getString(R.string.AccountFrozen2Text), R.drawable.menu_privacy);
        e.addView(n0Var2, w7.z5.t(-1, -2, 17, 0, 0, 0, 0));
        ai.n0 n0Var3 = new ai.n0(context, 1, d6Var);
        n0Var3.a(LocaleController.getString(R.string.AccountFrozen3Title), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.AccountFrozen3Text, LocaleController.formatYearMonthDay(MessagesController.getInstance(i10).freezeUntilDate, true)), new st0(oVar, 2)), R.drawable.menu_feature_hourglass);
        e.addView(n0Var3, w7.z5.t(-1, -2, 17, 0, 0, 0, 0));
        ei.d dVar = new ei.d(context, d6Var, true);
        dVar.g(LocaleController.getString(R.string.AccountFrozenButtonAppeal), false, true);
        dVar.setOnClickListener(new a(oVar, 0));
        e.addView(dVar, w7.z5.t(-1, 48, 7, 0, 13, 0, 4));
        ei.d dVar2 = new ei.d(context, d6Var, false);
        dVar2.g(LocaleController.getString(R.string.AccountFrozenButtonUnderstood), false, true);
        dVar2.setOnClickListener(new a(r5, 1));
        e.addView(dVar2, w7.z5.t(-1, 48, 7, 0, 0, 0, 0));
        i11.customView = e;
        org.telegram.ui.ActionBar.f3[] f3VarArr = {i11};
        i11.useBackgroundTopPadding = false;
        i11.fixNavigationBar();
        f35464a = true;
        f3VarArr[0].show();
        f3VarArr[0].setOnDismissListener(new ei.e1(1));
    }
}
