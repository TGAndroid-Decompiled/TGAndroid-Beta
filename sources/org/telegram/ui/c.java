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
    public static boolean f32966a;

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
        if (!f32966a && UserConfig.selectedAccount == i10) {
            Context context = LaunchActivity.D1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context == null) {
                return;
            }
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                f6Var = U.getResourceProvider();
            } else {
                f6Var = null;
            }
            c(context, i10, f6Var);
        }
    }

    public static void c(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        if (f32966a) {
            return;
        }
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
        ah.a aVar = new ah.a(i10, context, r5, 19);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.media_forbidden, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        f10.addView((View) imageView, k7.b6.t(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        b.g(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        org.telegram.messenger.y3.r(R.string.AccountFrozenTitle, textView, 17);
        f10.addView(textView, k7.b6.t(-1, -2, 17, 0, 0, 0, 23));
        lh.e0 e0Var = new lh.e0(context, 1, f6Var);
        e0Var.a(LocaleController.getString(R.string.AccountFrozen1Title), LocaleController.getString(R.string.AccountFrozen1Text), R.drawable.msg_block2);
        f10.addView(e0Var, k7.b6.t(-1, -2, 17, 0, 0, 0, 0));
        lh.e0 e0Var2 = new lh.e0(context, 1, f6Var);
        e0Var2.a(LocaleController.getString(R.string.AccountFrozen2Title), LocaleController.getString(R.string.AccountFrozen2Text), R.drawable.menu_privacy);
        f10.addView(e0Var2, k7.b6.t(-1, -2, 17, 0, 0, 0, 0));
        lh.e0 e0Var3 = new lh.e0(context, 1, f6Var);
        e0Var3.a(LocaleController.getString(R.string.AccountFrozen3Title), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.AccountFrozen3Text, LocaleController.formatYearMonthDay(MessagesController.getInstance(i10).freezeUntilDate, true)), new yt0(aVar, 2)), R.drawable.menu_feature_hourglass);
        f10.addView(e0Var3, k7.b6.t(-1, -2, 17, 0, 0, 0, 0));
        ph.d dVar = new ph.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.AccountFrozenButtonAppeal), false, true);
        dVar.setOnClickListener(new a(aVar, 0));
        f10.addView(dVar, k7.b6.t(-1, 48, 7, 0, 13, 0, 4));
        ph.d dVar2 = new ph.d(context, f6Var, false);
        dVar2.g(LocaleController.getString(R.string.AccountFrozenButtonUnderstood), false, true);
        dVar2.setOnClickListener(new a(r5, 1));
        f10.addView(dVar2, k7.b6.t(-1, 48, 7, 0, 0, 0, 0));
        o10.customView = f10;
        org.telegram.ui.ActionBar.g3[] g3VarArr = {o10};
        o10.useBackgroundTopPadding = false;
        o10.fixNavigationBar();
        f32966a = true;
        g3VarArr[0].show();
        g3VarArr[0].setOnDismissListener(new dg.e0(1));
    }
}
