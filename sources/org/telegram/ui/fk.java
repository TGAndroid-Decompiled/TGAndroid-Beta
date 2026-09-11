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
public final class fk extends org.telegram.ui.Components.oa0 {
    public boolean V;
    public final co W;

    public fk(co coVar, Context context, long j3, long j10, co coVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j3, j10, coVar2, f6Var);
        this.W = coVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        co coVar = this.W;
        if (coVar.R.getVisibility() == 0 && !coVar.f35350n3) {
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
        co coVar = this.W;
        if (coVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                coVar.xa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            bm bmVar = coVar.Ia;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.tu.J(coVar, null, bmVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, coVar.x9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        co coVar = this.W;
        mk mkVar = coVar.Y;
        if (mkVar != null) {
            hg.k1 adapter = getAdapter();
            TLRPC.User user = adapter.f11156w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f11147q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            mkVar.setCaption(str);
            org.telegram.ui.Components.xe xeVar = coVar.Y.O1;
            if (xeVar != null) {
                if (z10) {
                    xeVar.f25749e = true;
                    xeVar.f25747b = System.currentTimeMillis();
                    xeVar.invalidateSelf();
                    return;
                }
                xeVar.f25749e = false;
            }
        }
    }

    @Override
    public final void m() {
        co coVar = this.W;
        if (coVar.Z4 && ((getAdapter().R == null || coVar.f35189a5 || coVar.f35203b5) && coVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.f35247ea);
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                coVar.showDialog(alertDialog$Builder.f20198a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        coVar.sc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            co coVar = this.W;
            org.telegram.ui.Components.my0 my0Var = coVar.f35225d1;
            if (!coVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(my0Var, z11, false, true);
            this.V = z10;
        }
    }
}
