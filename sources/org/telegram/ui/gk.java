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
public final class gk extends org.telegram.ui.Components.pb0 {
    public boolean V;
    public final zn W;

    public gk(zn znVar, Context context, long j3, long j10, zn znVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j3, j10, znVar2, e6Var);
        this.W = znVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        zn znVar = this.W;
        if (znVar.R.getVisibility() == 0 && !znVar.f44864n3) {
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
        this.W.wc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        zn znVar = this.W;
        if (znVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                znVar.Ba(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            ki kiVar = znVar.Ja;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.lv.J(znVar, null, kiVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, znVar.C9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        zn znVar = this.W;
        ok okVar = znVar.Y;
        if (okVar != null) {
            gg.j1 adapter = getAdapter();
            TLRPC.User user = adapter.f10694w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f10685q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            okVar.setCaption(str);
            org.telegram.ui.Components.ze zeVar = znVar.Y.P1;
            if (zeVar != null) {
                if (z10) {
                    zeVar.f32421e = true;
                    zeVar.f32419b = System.currentTimeMillis();
                    zeVar.invalidateSelf();
                    return;
                }
                zeVar.f32421e = false;
            }
        }
    }

    @Override
    public final void m() {
        zn znVar = this.W;
        if (znVar.Z4 && ((getAdapter().R == null || znVar.f44703a5 || znVar.f44717b5) && znVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f44761ea);
                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                znVar.showDialog(alertDialog$Builder.f20374a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        znVar.wc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            zn znVar = this.W;
            org.telegram.ui.Components.oz0 oz0Var = znVar.f44739d1;
            if (!znVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(oz0Var, z11, false, true);
            this.V = z10;
        }
    }
}
