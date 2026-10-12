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
public final class kk extends org.telegram.ui.Components.tb0 {
    public boolean V;
    public final eo W;

    public kk(eo eoVar, Context context, long j3, long j10, eo eoVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, j3, j10, eoVar2, c6Var);
        this.W = eoVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        eo eoVar = this.W;
        if (eoVar.R.getVisibility() == 0 && !eoVar.f37354n3) {
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
        eo eoVar = this.W;
        if (eoVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                eoVar.Ba(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            oi oiVar = eoVar.Ja;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.ov.J(eoVar, null, oiVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, eoVar.C9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        eo eoVar = this.W;
        sk skVar = eoVar.Y;
        if (skVar != null) {
            gg.j1 adapter = getAdapter();
            TLRPC.User user = adapter.f10692w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f10683q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            skVar.setCaption(str);
            org.telegram.ui.Components.ze zeVar = eoVar.Y.P1;
            if (zeVar != null) {
                if (z10) {
                    zeVar.f32827e = true;
                    zeVar.f32825b = System.currentTimeMillis();
                    zeVar.invalidateSelf();
                    return;
                }
                zeVar.f32827e = false;
            }
        }
    }

    @Override
    public final void m() {
        eo eoVar = this.W;
        if (eoVar.Z4 && ((getAdapter().R == null || eoVar.f37193a5 || eoVar.f37207b5) && eoVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.f37251ea);
                alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                eoVar.showDialog(alertDialog$Builder.f20141a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        eoVar.wc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            eo eoVar = this.W;
            org.telegram.ui.Components.uz0 uz0Var = eoVar.f37229d1;
            if (!eoVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(uz0Var, z11, false, true);
            this.V = z10;
        }
    }
}
