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
public final class kk extends org.telegram.ui.Components.ob0 {
    public boolean V;
    public final fo W;

    public kk(fo foVar, Context context, long j10, long j11, fo foVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, j10, j11, foVar2, c6Var);
        this.W = foVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        fo foVar = this.W;
        if (foVar.R.getVisibility() == 0 && !foVar.f36036n3) {
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
        fo foVar = this.W;
        if (foVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                foVar.Ba(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            oi oiVar = foVar.Ja;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.hv.J(foVar, null, oiVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, foVar.C9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        fo foVar = this.W;
        sk skVar = foVar.Y;
        if (skVar != null) {
            hg.j1 adapter = getAdapter();
            TLRPC.User user = adapter.f10638w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f10629q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            skVar.setCaption(str);
            org.telegram.ui.Components.ye yeVar = foVar.Y.P1;
            if (yeVar != null) {
                if (z10) {
                    yeVar.e = true;
                    yeVar.f29175b = System.currentTimeMillis();
                    yeVar.invalidateSelf();
                    return;
                }
                yeVar.e = false;
            }
        }
    }

    @Override
    public final void m() {
        fo foVar = this.W;
        if (foVar.Z4 && ((getAdapter().R == null || foVar.f35875a5 || foVar.f35889b5) && foVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar.getParentActivity(), 0, foVar.f35932ea);
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                foVar.showDialog(alertDialog$Builder.f19548a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        foVar.wc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            fo foVar = this.W;
            org.telegram.ui.Components.kz0 kz0Var = foVar.f35912d1;
            if (!foVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(kz0Var, z11, false, true);
            this.V = z10;
        }
    }
}
