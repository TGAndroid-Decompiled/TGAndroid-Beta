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
public final class ck extends org.telegram.ui.Components.za0 {
    public boolean V;
    public final wn W;

    public ck(wn wnVar, Context context, long j3, long j10, wn wnVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, j3, j10, wnVar2, d6Var);
        this.W = wnVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        wn wnVar = this.W;
        if (wnVar.R.getVisibility() == 0 && !wnVar.f39572n3) {
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
        wn wnVar = this.W;
        if (wnVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                wnVar.xa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            xl xlVar = wnVar.Ia;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.wu.J(wnVar, null, xlVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, wnVar.x9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        wn wnVar = this.W;
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            gg.k1 adapter = getAdapter();
            TLRPC.User user = adapter.f9823w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f9814q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            jkVar.setCaption(str);
            org.telegram.ui.Components.xe xeVar = wnVar.Y.P1;
            if (xeVar != null) {
                if (z10) {
                    xeVar.e = true;
                    xeVar.f24495b = System.currentTimeMillis();
                    xeVar.invalidateSelf();
                    return;
                }
                xeVar.e = false;
            }
        }
    }

    @Override
    public final void m() {
        wn wnVar = this.W;
        if (wnVar.Z4 && ((getAdapter().R == null || wnVar.f39412a5 || wnVar.f39426b5) && wnVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.f39469ea);
                alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                wnVar.showDialog(alertDialog$Builder.f18661a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        wnVar.sc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            wn wnVar = this.W;
            org.telegram.ui.Components.xy0 xy0Var = wnVar.f39448d1;
            if (!wnVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(xy0Var, z11, false, true);
            this.V = z10;
        }
    }
}
