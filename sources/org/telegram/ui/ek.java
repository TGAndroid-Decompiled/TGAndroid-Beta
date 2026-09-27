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
public final class ek extends org.telegram.ui.Components.ab0 {
    public boolean V;
    public final xn W;

    public ek(xn xnVar, Context context, long j3, long j10, xn xnVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j3, j10, xnVar2, e6Var);
        this.W = xnVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        xn xnVar = this.W;
        if (xnVar.R.getVisibility() == 0 && !xnVar.f39854n3) {
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
        this.W.sc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        xn xnVar = this.W;
        if (xnVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                xnVar.xa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            yl ylVar = xnVar.Ia;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.xu.J(xnVar, null, ylVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, xnVar.x9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        xn xnVar = this.W;
        lk lkVar = xnVar.Y;
        if (lkVar != null) {
            gg.k1 adapter = getAdapter();
            TLRPC.User user = adapter.f9829w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f9820q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            lkVar.setCaption(str);
            org.telegram.ui.Components.xe xeVar = xnVar.Y.P1;
            if (xeVar != null) {
                if (z10) {
                    xeVar.e = true;
                    xeVar.f24878b = System.currentTimeMillis();
                    xeVar.invalidateSelf();
                    return;
                }
                xeVar.e = false;
            }
        }
    }

    @Override
    public final void m() {
        xn xnVar = this.W;
        if (xnVar.Z4 && ((getAdapter().R == null || xnVar.f39693a5 || xnVar.f39707b5) && xnVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f39750ea);
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                xnVar.showDialog(alertDialog$Builder.f18655a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        xnVar.sc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            xn xnVar = this.W;
            org.telegram.ui.Components.zy0 zy0Var = xnVar.f39729d1;
            if (!xnVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(zy0Var, z11, false, true);
            this.V = z10;
        }
    }
}
