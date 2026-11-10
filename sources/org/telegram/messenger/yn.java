package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class yn implements RequestDelegate {
    public final int f26701a;
    public final c1 f26702b;
    public final Object f26703c;
    public final Object d;
    public final Object f26704e;
    public final Object f26705f;
    public final TLObject f26706g;

    public yn(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i7) {
        this.f26701a = i7;
        this.f26702b = c1Var;
        this.f26703c = obj;
        this.d = obj2;
        this.f26704e = obj3;
        this.f26705f = obj4;
        this.f26706g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26701a) {
            case 0:
                qp qpVar = (qp) this.f26702b;
                Context context = (Context) this.f26703c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                qr qrVar = (qr) this.f26704e;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f26705f;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.f26706g;
                qpVar.getClass();
                if (tL_error == null) {
                    if (context != null) {
                        g0.h3(new fn(1, context, u1Var));
                    }
                    qpVar.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new a(qrVar, 27));
                    return;
                }
                g0.h3(new gn(qpVar, qrVar, context, u1Var, tL_error, f2Var, tL_channels_convertToGigagroup, 1));
                return;
            default:
                final f10 f10Var = (f10) this.f26702b;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f26703c;
                final String str = (String) this.d;
                final d10 d10Var = (d10) this.f26704e;
                final bi.r3 r3Var = (bi.r3) this.f26705f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f26706g;
                f10Var.getClass();
                if (tLObject instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() <= 0) {
                        g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r6) {
                                    case 0:
                                        f10 f10Var2 = f10Var;
                                        f10Var2.getClass();
                                        TL_stories.StoryItem storyItem2 = storyItem;
                                        storyItem2.translatedLng = str;
                                        storyItem2.translatedText = null;
                                        f10Var2.getMessagesController().P1().f10005k.h(storyItem2.dialogId, storyItem2);
                                        f10Var2.J.remove(d10Var);
                                        r3Var.run();
                                        return;
                                    default:
                                        f10 f10Var3 = f10Var;
                                        f10Var3.getClass();
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        storyItem3.translatedLng = str;
                                        storyItem3.translatedText = null;
                                        f10Var3.getMessagesController().P1().f10005k.h(storyItem3.dialogId, storyItem3);
                                        f10Var3.J.remove(d10Var);
                                        r3Var.run();
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        g0.h3(new gn(f10Var, storyItem, str, tL_textWithEntities, arrayList.get(0), d10Var, r3Var, 4));
                        return;
                    }
                }
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r6) {
                            case 0:
                                f10 f10Var2 = f10Var;
                                f10Var2.getClass();
                                TL_stories.StoryItem storyItem2 = storyItem;
                                storyItem2.translatedLng = str;
                                storyItem2.translatedText = null;
                                f10Var2.getMessagesController().P1().f10005k.h(storyItem2.dialogId, storyItem2);
                                f10Var2.J.remove(d10Var);
                                r3Var.run();
                                return;
                            default:
                                f10 f10Var3 = f10Var;
                                f10Var3.getClass();
                                TL_stories.StoryItem storyItem3 = storyItem;
                                storyItem3.translatedLng = str;
                                storyItem3.translatedText = null;
                                f10Var3.getMessagesController().P1().f10005k.h(storyItem3.dialogId, storyItem3);
                                f10Var3.J.remove(d10Var);
                                r3Var.run();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
