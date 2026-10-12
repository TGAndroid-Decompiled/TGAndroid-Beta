package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p9 extends Drawable {
    public final ViewGroup f28248a;
    public final int f28249b;
    public boolean d;
    public final int e;
    public final int f28251f;
    public final float f28252g;
    public final ne.j f28250c = new ne.j(new l2.f(this, 7), es.h, 380);
    public final ArrayList h = new ArrayList();
    public int f28253i = 255;

    public p9(int i10, ViewGroup viewGroup, int i11, int i12, float f7) {
        this.f28249b = i10;
        this.f28248a = viewGroup;
        this.e = i11;
        this.f28251f = i12;
        this.f28252g = f7;
    }

    public final void a() {
        if (!this.d) {
            this.d = true;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                o9 o9Var = (o9) obj;
                if (o9Var.f27913c != 0 && !o9Var.d) {
                    o9Var.d = true;
                    o9Var.f27911a.onAttachedToWindow();
                }
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                o9 o9Var = (o9) obj;
                if (o9Var.d) {
                    o9Var.d = false;
                    o9Var.f27911a.onDetachedFromWindow();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f28253i != 0) {
            float f7 = bounds.left;
            float f10 = bounds.top;
            ne.j jVar = this.f28250c;
            canvas.saveLayer(f7, f10, f7 + jVar.d.f16309f.f16316a, f10 + this.e, null);
            for (int size = jVar.f16312b.size() - 1; size >= 0; size--) {
                ne.g m10 = jVar.m(size);
                RectF b10 = m10.b();
                Object obj = m10.f16302a;
                float f11 = m10.f16305f.f16316a;
                float c10 = m10.c();
                float width = b10.width() - f11;
                float f12 = f7 + b10.left + f11;
                float f13 = width / 2.0f;
                float f14 = f12 + f13;
                float f15 = f10 + f13;
                canvas.save();
                canvas.scale(c10, c10, f14, f15);
                canvas.drawCircle(f14, f15, f13 + this.f28252g, org.telegram.ui.ActionBar.g6.Ll);
                o9 o9Var = (o9) obj;
                o9Var.f27911a.setImageCoords(f12, f10, width, width);
                o9Var.f27911a.setAlpha((this.f28253i / 255.0f) * m10.c());
                o9Var.f27911a.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z10) {
        o9 o9Var;
        ne.j jVar = this.f28250c;
        if (list != null && !list.isEmpty()) {
            if (!z10) {
                jVar.q(null, false);
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) it.next());
                ArrayList arrayList2 = this.h;
                int size = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        o9Var = (o9) obj;
                        if (o9Var.f27913c == peerDialogId) {
                            break;
                        }
                    } else {
                        o9Var = null;
                        break;
                    }
                }
                if (o9Var == null) {
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            o9Var = (o9) obj2;
                            if (o9Var.f27913c == 0) {
                                break;
                            }
                        } else {
                            o9Var = null;
                            break;
                        }
                    }
                }
                if (o9Var == null) {
                    o9Var = new o9(this, this.f28248a);
                    arrayList2.add(o9Var);
                }
                ImageReceiver imageReceiver = o9Var.f27911a;
                k9 k9Var = o9Var.f27912b;
                if (o9Var.f27913c != peerDialogId) {
                    o9Var.f27913c = peerDialogId;
                    int i12 = this.f28249b;
                    TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(peerDialogId);
                    if (userOrChat != null) {
                        k9Var.j(i12, userOrChat);
                        imageReceiver.setForUserOrChat(userOrChat, k9Var);
                    } else {
                        k9Var.n(peerDialogId, "", "");
                        imageReceiver.clearImage();
                    }
                }
                arrayList.add(o9Var);
                if (this.d && !o9Var.d) {
                    o9Var.d = true;
                    imageReceiver.onAttachedToWindow();
                }
            }
            jVar.q(arrayList, z10);
            return;
        }
        jVar.q(null, z10);
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    @Override
    public final int getAlpha() {
        return this.f28253i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28253i = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
