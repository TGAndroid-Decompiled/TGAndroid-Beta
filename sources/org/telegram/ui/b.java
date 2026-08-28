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
    public static boolean f36580a;

    public static boolean a(int i9, TLRPC.User user) {
        String publicUsername;
        if (user == null || (publicUsername = UserObject.getPublicUsername(user)) == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("t\\.me/([a-zA-Z0-9]+)/?").matcher(MessagesController.getInstance(i9).freezeAppealUrl);
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

    public static void b(int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        if (!f36580a && UserConfig.selectedAccount == i9) {
            Context context = LaunchActivity.C1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context == null) {
                return;
            }
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                b6Var = U.getResourceProvider();
            } else {
                b6Var = null;
            }
            c(context, i9, b6Var);
        }
    }

    public static void c(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        if (f36580a) {
            return;
        }
        org.telegram.ui.ActionBar.f3 j10 = org.telegram.messenger.ll.j(context, b6Var, false, false);
        d5.i iVar = new d5.i(i9, context, r5, 22);
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f10.setClipChildren(false);
        f10.setClipToPadding(false);
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.media_forbidden, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        f10.addView((View) imageView, g7.e6.t(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.k(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        org.telegram.messenger.ll.l(R.string.AccountFrozenTitle, textView, 17);
        f10.addView(textView, g7.e6.t(-1, -2, 17, 0, 0, 0, 23));
        gh.f0 f0Var = new gh.f0(context, 1, b6Var);
        f0Var.a(LocaleController.getString(R.string.AccountFrozen1Title), LocaleController.getString(R.string.AccountFrozen1Text), R.drawable.msg_block2);
        f10.addView(f0Var, g7.e6.t(-1, -2, 17, 0, 0, 0, 0));
        gh.f0 f0Var2 = new gh.f0(context, 1, b6Var);
        f0Var2.a(LocaleController.getString(R.string.AccountFrozen2Title), LocaleController.getString(R.string.AccountFrozen2Text), R.drawable.menu_privacy);
        f10.addView(f0Var2, g7.e6.t(-1, -2, 17, 0, 0, 0, 0));
        gh.f0 f0Var3 = new gh.f0(context, 1, b6Var);
        f0Var3.a(LocaleController.getString(R.string.AccountFrozen3Title), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.AccountFrozen3Text, LocaleController.formatYearMonthDay(MessagesController.getInstance(i9).freezeUntilDate, true)), new kt0(iVar, 2)), R.drawable.menu_feature_hourglass);
        f10.addView(f0Var3, g7.e6.t(-1, -2, 17, 0, 0, 0, 0));
        kh.d dVar = new kh.d(context, b6Var, true);
        dVar.g(LocaleController.getString(R.string.AccountFrozenButtonAppeal), false, true);
        dVar.setOnClickListener(new a(iVar, 0));
        f10.addView(dVar, g7.e6.t(-1, 48, 7, 0, 13, 0, 4));
        kh.d dVar2 = new kh.d(context, b6Var, false);
        dVar2.g(LocaleController.getString(R.string.AccountFrozenButtonUnderstood), false, true);
        dVar2.setOnClickListener(new a(r5, 1));
        f10.addView(dVar2, g7.e6.t(-1, 48, 7, 0, 0, 0, 0));
        j10.customView = f10;
        org.telegram.ui.ActionBar.f3[] f3VarArr = {j10};
        j10.useBackgroundTopPadding = false;
        j10.fixNavigationBar();
        f36580a = true;
        f3VarArr[0].show();
        f3VarArr[0].setOnDismissListener(new kh.g1(1));
    }
}
