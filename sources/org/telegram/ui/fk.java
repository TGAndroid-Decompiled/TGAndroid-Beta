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
public final class fk extends org.telegram.ui.Components.na0 {
    public boolean V;
    public final bo W;

    public fk(bo boVar, Context context, long j3, long j10, bo boVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j3, j10, boVar2, e6Var);
        this.W = boVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        bo boVar = this.W;
        if (boVar.R.getVisibility() == 0 && !boVar.f32401n3) {
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
        bo boVar = this.W;
        if (boVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                boVar.xa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            bm bmVar = boVar.Ia;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.vu.J(boVar, null, bmVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, boVar.x9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        bo boVar = this.W;
        mk mkVar = boVar.Y;
        if (mkVar != null) {
            gg.k1 adapter = getAdapter();
            TLRPC.User user = adapter.f9837w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f9828q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            mkVar.setCaption(str);
            org.telegram.ui.Components.ue ueVar = boVar.Y.O1;
            if (ueVar != null) {
                if (z10) {
                    ueVar.e = true;
                    ueVar.f24054b = System.currentTimeMillis();
                    ueVar.invalidateSelf();
                    return;
                }
                ueVar.e = false;
            }
        }
    }

    @Override
    public final void m() {
        bo boVar = this.W;
        if (boVar.Z4 && ((getAdapter().R == null || boVar.f32240a5 || boVar.f32254b5) && boVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.f32297ea);
                alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                boVar.showDialog(alertDialog$Builder.f18437a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        boVar.sc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            bo boVar = this.W;
            org.telegram.ui.Components.ny0 ny0Var = boVar.f32276d1;
            if (!boVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(ny0Var, z11, false, true);
            this.V = z10;
        }
    }
}
