package org.telegram.ui;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class aw implements Runnable {
    public final int f35761a = 0;
    public final boolean f35762b;
    public final long f35763c;
    public final boolean d;
    public final org.telegram.messenger.us e;
    public final TLObject f35764f;
    public final TLObject h;

    public aw(ay ayVar, TLRPC.Chat chat, long j10, boolean z10, TLRPC.User user, boolean z11) {
        this.e = ayVar;
        this.f35764f = chat;
        this.f35763c = j10;
        this.f35762b = z10;
        this.h = user;
        this.d = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f35761a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f35764f;
        org.telegram.messenger.us usVar = this.e;
        switch (i10) {
            case 0:
                ay ayVar = (ay) usVar;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f35763c;
                boolean z10 = this.f35762b;
                if (chat != null) {
                    if (org.telegram.messenger.w3.r0(chat)) {
                        ayVar.getMessagesController().X(0, j10, z10);
                    } else {
                        ayVar.getMessagesController().g0(-j10, ayVar.getMessagesController().Z1(Long.valueOf(ayVar.getUserConfig().e())), null, z10, z10);
                    }
                } else {
                    ayVar.getMessagesController().X(0, j10, z10);
                    if (user != null && user.bot && this.d) {
                        ayVar.getMessagesController().w(user.f19942id);
                    }
                }
                ayVar.getMessagesController().J(ayVar.W2);
                return;
            default:
                vh.o8 o8Var = (vh.o8) usVar;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z11 = this.f35762b;
                long j11 = this.f35763c;
                if (!z11) {
                    th.s0.W = new th.s0(o8Var.f51607b, o8Var.f51611c, storyItem, j11, storyItem.f20031id, z11, inputGroupCall, true, this.d);
                }
                vh.j8 j8Var = o8Var.F;
                if (j8Var != null) {
                    j8Var.f(false);
                }
                o8Var.F = null;
                o8Var.J = 0;
                RectF rectF = o8Var.H;
                Point point = org.telegram.messenger.i0.f16026q;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                o8Var.G = org.telegram.messenger.i0.L(8.0f);
                o8Var.p(true);
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                storyItem.dialogId = j11;
                storyItem.justUploaded = true;
                T.getOrCreateStoryViewer().U(o8Var.f51607b, storyItem, null);
                org.telegram.messenger.zs.f(o8Var.f51611c).k(176, Long.valueOf(inputGroupCall.f19810id));
                return;
        }
    }

    public aw(vh.o8 o8Var, boolean z10, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = o8Var;
        this.f35762b = z10;
        this.f35764f = storyItem;
        this.f35763c = j10;
        this.h = inputGroupCall;
        this.d = z11;
    }
}
