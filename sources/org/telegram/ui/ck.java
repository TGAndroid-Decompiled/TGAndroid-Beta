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
public final class ck extends org.telegram.ui.Components.bb0 {
    public boolean V;
    public final yn W;

    public ck(yn ynVar, Context context, long j3, long j10, yn ynVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, j3, j10, ynVar2, d6Var);
        this.W = ynVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        yn ynVar = this.W;
        if (ynVar.P.getVisibility() == 0 && !ynVar.f43403l3) {
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
        this.W.rc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        yn ynVar = this.W;
        if (ynVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                ynVar.wa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            xl xlVar = ynVar.Ga;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.zu.H(ynVar, null, xlVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, ynVar.w9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        yn ynVar = this.W;
        jk jkVar = ynVar.W;
        if (jkVar != null) {
            gg.k1 adapter = getAdapter();
            TLRPC.User user = adapter.f10695w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f10686q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            jkVar.setCaption(str);
            org.telegram.ui.Components.ye yeVar = ynVar.W.P1;
            if (yeVar != null) {
                if (z10) {
                    yeVar.f27457e = true;
                    yeVar.f27455b = System.currentTimeMillis();
                    yeVar.invalidateSelf();
                    return;
                }
                yeVar.f27457e = false;
            }
        }
    }

    @Override
    public final void m() {
        yn ynVar = this.W;
        if (ynVar.X4 && ((getAdapter().R == null || ynVar.Y4 || ynVar.Z4) && ynVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.f43299ca);
                alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                ynVar.showDialog(alertDialog$Builder.f20367a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        ynVar.rc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            yn ynVar = this.W;
            org.telegram.ui.Components.iz0 iz0Var = ynVar.f43276b1;
            if (!ynVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(iz0Var, z11, false, true);
            this.V = z10;
        }
    }
}
