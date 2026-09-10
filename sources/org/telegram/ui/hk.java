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
public final class hk extends org.telegram.ui.Components.xa0 {
    public boolean V;
    public final eo W;

    public hk(eo eoVar, Context context, long j3, long j10, eo eoVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j3, j10, eoVar2, f6Var);
        this.W = eoVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        eo eoVar = this.W;
        if (eoVar.R.getVisibility() == 0 && !eoVar.f32419n3) {
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
        eo eoVar = this.W;
        if (eoVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                eoVar.xa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            dm dmVar = eoVar.Ia;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.zu.J(eoVar, null, dmVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, eoVar.x9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        eo eoVar = this.W;
        ok okVar = eoVar.Y;
        if (okVar != null) {
            fg.l1 adapter = getAdapter();
            TLRPC.User user = adapter.f8129w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f8120q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            okVar.setCaption(str);
            org.telegram.ui.Components.xe xeVar = eoVar.Y.O1;
            if (xeVar != null) {
                if (z10) {
                    xeVar.e = true;
                    xeVar.f25072b = System.currentTimeMillis();
                    xeVar.invalidateSelf();
                    return;
                }
                xeVar.e = false;
            }
        }
    }

    @Override
    public final void m() {
        eo eoVar = this.W;
        if (eoVar.Z4 && ((getAdapter().R == null || eoVar.f32259a5 || eoVar.f32273b5) && eoVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.f32316ea);
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                eoVar.showDialog(alertDialog$Builder.f17528a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        eoVar.sc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            eo eoVar = this.W;
            org.telegram.ui.Components.zy0 zy0Var = eoVar.f32295d1;
            if (!eoVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(zy0Var, z11, false, true);
            this.V = z10;
        }
    }
}
