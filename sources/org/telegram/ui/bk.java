package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bk extends org.telegram.ui.Components.ra0 {
    public boolean S;
    public final xn T;

    public bk(xn xnVar, Context context, long j10, long j11, xn xnVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, j10, j11, xnVar2, g6Var);
        this.T = xnVar;
        this.S = true;
    }

    @Override
    public final boolean a() {
        xn xnVar = this.T;
        if (xnVar.O.getVisibility() == 0 && !xnVar.f43243k3) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void j() {
        this.T.sc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        xn xnVar = this.T;
        if (xnVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                xnVar.xa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            yl ylVar = xnVar.Fa;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.ru.I(xnVar, null, ylVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, xnVar.x9());
        }
    }

    @Override
    public final void l(boolean z4) {
        String str;
        xn xnVar = this.T;
        jk jkVar = xnVar.V;
        if (jkVar != null) {
            uf.u0 adapter = getAdapter();
            TLRPC.User user = adapter.f48717t0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f48709n0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            jkVar.setCaption(str);
            org.telegram.ui.Components.ne neVar = xnVar.V.L1;
            if (neVar != null) {
                if (z4) {
                    neVar.f26982e = true;
                    neVar.f26980b = System.currentTimeMillis();
                    neVar.invalidateSelf();
                    return;
                }
                neVar.f26982e = false;
            }
        }
    }

    @Override
    public final void m() {
        xn xnVar = this.T;
        if (xnVar.W4 && ((getAdapter().O == null || xnVar.X4 || xnVar.Y4) && xnVar.h != null && getAdapter().O != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f43136ba);
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                xnVar.showDialog(alertDialog$Builder.f21166a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        xnVar.sc();
    }

    @Override
    public final void n(boolean z4) {
        boolean z10;
        if (this.S != z4) {
            xn xnVar = this.T;
            org.telegram.ui.Components.ry0 ry0Var = xnVar.f43114a1;
            if (!xnVar.isInPreviewMode() && z4) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.updateViewShow(ry0Var, z10, false, true);
            this.S = z4;
        }
    }
}
