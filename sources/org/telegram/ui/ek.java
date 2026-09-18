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
public final class ek extends org.telegram.ui.Components.wa0 {
    public boolean V;
    public final zn W;

    public ek(zn znVar, Context context, long j3, long j10, zn znVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j3, j10, znVar2, e6Var);
        this.W = znVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        zn znVar = this.W;
        if (znVar.R.getVisibility() == 0 && !znVar.f40365n3) {
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
        zn znVar = this.W;
        if (znVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                znVar.xa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            zl zlVar = znVar.Ia;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.vu.J(znVar, null, zlVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, znVar.x9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        zn znVar = this.W;
        lk lkVar = znVar.Y;
        if (lkVar != null) {
            gg.k1 adapter = getAdapter();
            TLRPC.User user = adapter.f9841w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f9832q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            lkVar.setCaption(str);
            org.telegram.ui.Components.we weVar = znVar.Y.O1;
            if (weVar != null) {
                if (z10) {
                    weVar.e = true;
                    weVar.f24198b = System.currentTimeMillis();
                    weVar.invalidateSelf();
                    return;
                }
                weVar.e = false;
            }
        }
    }

    @Override
    public final void m() {
        zn znVar = this.W;
        if (znVar.Z4 && ((getAdapter().R == null || znVar.f40204a5 || znVar.f40218b5) && znVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f40261ea);
                alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f18622a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                znVar.showDialog(alertDialog$Builder.f18622a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        znVar.sc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            zn znVar = this.W;
            org.telegram.ui.Components.zy0 zy0Var = znVar.f40240d1;
            if (!znVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(zy0Var, z11, false, true);
            this.V = z10;
        }
    }
}
