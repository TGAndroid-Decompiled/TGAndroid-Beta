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
public final class dk extends org.telegram.ui.Components.qa0 {
    public boolean S;
    public final zn T;

    public dk(zn znVar, Context context, long j10, long j11, zn znVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j10, j11, znVar2, f6Var);
        this.T = znVar;
        this.S = true;
    }

    @Override
    public final boolean a() {
        zn znVar = this.T;
        if (znVar.O.getVisibility() == 0 && !znVar.f40640k3) {
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
        this.T.sc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        zn znVar = this.T;
        if (znVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                znVar.xa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            am amVar = znVar.Fa;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.ou.I(znVar, null, amVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, znVar.x9());
        }
    }

    @Override
    public final void l(boolean z4) {
        String str;
        zn znVar = this.T;
        lk lkVar = znVar.V;
        if (lkVar != null) {
            tf.u0 adapter = getAdapter();
            TLRPC.User user = adapter.f44922t0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f44914n0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            lkVar.setCaption(str);
            org.telegram.ui.Components.ne neVar = znVar.V.L1;
            if (neVar != null) {
                if (z4) {
                    neVar.e = true;
                    neVar.f24012b = System.currentTimeMillis();
                    neVar.invalidateSelf();
                    return;
                }
                neVar.e = false;
            }
        }
    }

    @Override
    public final void m() {
        zn znVar = this.T;
        if (znVar.W4 && ((getAdapter().O == null || znVar.X4 || znVar.Y4) && znVar.h != null && getAdapter().O != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f40534ba);
                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                znVar.showDialog(alertDialog$Builder.f19478a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        znVar.sc();
    }

    @Override
    public final void n(boolean z4) {
        boolean z10;
        if (this.S != z4) {
            zn znVar = this.T;
            org.telegram.ui.Components.qy0 qy0Var = znVar.f40512a1;
            if (!znVar.isInPreviewMode() && z4) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.updateViewShow(qy0Var, z10, false, true);
            this.S = z4;
        }
    }
}
