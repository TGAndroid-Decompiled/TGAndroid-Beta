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

public final class d9 extends Drawable {

    public final ViewGroup f27673a;

    public final int f27674b;
    public boolean d;

    public final int f27676e;

    public final int f27677f;

    public final float f27678g;

    public final ud.h f27675c = new ud.h(new n2.b0(this, 8), er.h, 380);
    public final ArrayList h = new ArrayList();

    public int f27679i = 255;

    public d9(int i10, ViewGroup viewGroup, int i11, int i12, float f10) {
        this.f27674b = i10;
        this.f27673a = viewGroup;
        this.f27676e = i11;
        this.f27677f = i12;
        this.f27678g = f10;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            c9 c9Var = (c9) obj;
            if (c9Var.f27381c != 0 && !c9Var.d) {
                c9Var.d = true;
                c9Var.f27379a.onAttachedToWindow();
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
                c9 c9Var = (c9) obj;
                if (c9Var.d) {
                    c9Var.d = false;
                    c9Var.f27379a.onDetachedFromWindow();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.f27679i == 0) {
            return;
        }
        float f10 = bounds.left;
        float f11 = bounds.top;
        ud.h hVar = this.f27675c;
        canvas.saveLayer(f10, f11, f10 + hVar.d.f48514f.f48522a, f11 + this.f27676e, null);
        for (int size = hVar.f48517b.size() - 1; size >= 0; size--) {
            ud.e eVarN = hVar.n(size);
            RectF rectFB = eVarN.b();
            Object obj = eVarN.f48505a;
            float f12 = eVarN.f48509f.f48522a;
            float fC = eVarN.c();
            float f13 = rectFB.left + f12;
            float fWidth = rectFB.width() - f12;
            float f14 = f10 + f13;
            float f15 = fWidth / 2.0f;
            float f16 = f14 + f15;
            float f17 = f11 + f15;
            canvas.save();
            canvas.scale(fC, fC, f16, f17);
            canvas.drawCircle(f16, f17, f15 + this.f27678g, org.telegram.ui.ActionBar.g6.Il);
            c9 c9Var = (c9) obj;
            c9Var.f27379a.setImageCoords(f14, f11, fWidth, fWidth);
            c9Var.f27379a.setAlpha((this.f27679i / 255.0f) * eVarN.c());
            c9Var.f27379a.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void d(List list, boolean z10) {
        c9 c9Var;
        ud.h hVar = this.f27675c;
        if (list == null || list.isEmpty()) {
            hVar.r(null, z10);
            return;
        }
        if (!z10) {
            hVar.r(null, false);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) it.next());
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i10 = 0;
            do {
                if (i10 >= size) {
                    c9Var = null;
                    break;
                } else {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    c9Var = (c9) obj;
                }
            } while (c9Var.f27381c != peerDialogId);
            if (c9Var == null) {
                int size2 = arrayList2.size();
                int i11 = 0;
                do {
                    if (i11 >= size2) {
                        c9Var = null;
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        c9Var = (c9) obj2;
                    }
                } while (c9Var.f27381c != 0);
            }
            if (c9Var == null) {
                c9Var = new c9(this, this.f27673a);
                arrayList2.add(c9Var);
            }
            ImageReceiver imageReceiver = c9Var.f27379a;
            y8 y8Var = c9Var.f27380b;
            if (c9Var.f27381c != peerDialogId) {
                c9Var.f27381c = peerDialogId;
                int i12 = this.f27674b;
                TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(peerDialogId);
                if (userOrChat != null) {
                    y8Var.j(i12, userOrChat);
                    imageReceiver.setForUserOrChat(userOrChat, y8Var);
                } else {
                    y8Var.n(peerDialogId, "", "");
                    imageReceiver.clearImage();
                }
            }
            arrayList.add(c9Var);
            if (this.d && !c9Var.d) {
                c9Var.d = true;
                imageReceiver.onAttachedToWindow();
            }
        }
        hVar.r(arrayList, z10);
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    @Override
    public final int getAlpha() {
        return this.f27679i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27679i = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
