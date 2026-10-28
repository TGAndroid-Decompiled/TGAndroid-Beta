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
public final class bk extends org.telegram.ui.Components.hb0 {
    public boolean V;
    public final wn W;

    public bk(wn wnVar, Context context, long j10, long j11, wn wnVar2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, j10, j11, wnVar2, u6Var);
        this.W = wnVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        wn wnVar = this.W;
        if (wnVar.R.getVisibility() == 0 && !wnVar.f45367z3) {
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
        this.W.Jc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        wn wnVar = this.W;
        if (wnVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                wnVar.Ja(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            fi fiVar = wnVar.Za;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.dv.I(wnVar, null, fiVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, wnVar.I9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        wn wnVar = this.W;
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            ig.j1 adapter = getAdapter();
            TLRPC.User user = adapter.f14136w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f14127q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            jkVar.setCaption(str);
            org.telegram.ui.Components.we weVar = wnVar.Y.P1;
            if (weVar != null) {
                if (z10) {
                    weVar.e = true;
                    weVar.f32319b = System.currentTimeMillis();
                    weVar.invalidateSelf();
                    return;
                }
                weVar.e = false;
            }
        }
    }

    @Override
    public final void m() {
        wn wnVar = this.W;
        if (wnVar.f45242p5 && ((getAdapter().R == null || wnVar.q5 || wnVar.f45265r5) && wnVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.f45309ua);
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                wnVar.showDialog(alertDialog$Builder.f22369a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        wnVar.Jc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            wn wnVar = this.W;
            org.telegram.ui.Components.uz0 uz0Var = wnVar.f45238p1;
            if (!wnVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(uz0Var, z11, false, true);
            this.V = z10;
        }
    }
}
