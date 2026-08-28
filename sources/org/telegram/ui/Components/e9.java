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
public final class e9 extends Drawable {
    public final ViewGroup f27979a;
    public final int f27980b;
    public boolean d;
    public final int f27982e;
    public final int f27983f;
    public final float f27984g;
    public final td.h f27981c = new td.h(new n5.a0(this, 6), gr.h, 380);
    public final ArrayList h = new ArrayList();
    public int f27985i = 255;

    public e9(int i9, ViewGroup viewGroup, int i10, int i11, float f10) {
        this.f27980b = i9;
        this.f27979a = viewGroup;
        this.f27982e = i10;
        this.f27983f = i11;
        this.f27984g = f10;
    }

    public final void a() {
        if (!this.d) {
            this.d = true;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                d9 d9Var = (d9) obj;
                if (d9Var.f27690c != 0 && !d9Var.d) {
                    d9Var.d = true;
                    d9Var.f27688a.onAttachedToWindow();
                }
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                d9 d9Var = (d9) obj;
                if (d9Var.d) {
                    d9Var.d = false;
                    d9Var.f27688a.onDetachedFromWindow();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f27985i != 0) {
            float f10 = bounds.left;
            float f11 = bounds.top;
            td.h hVar = this.f27981c;
            canvas.saveLayer(f10, f11, f10 + hVar.d.f47792f.f47800a, f11 + this.f27982e, null);
            for (int size = hVar.f47795b.size() - 1; size >= 0; size--) {
                td.e n10 = hVar.n(size);
                RectF b10 = n10.b();
                Object obj = n10.f47783a;
                float f12 = n10.f47787f.f47800a;
                float c10 = n10.c();
                float width = b10.width() - f12;
                float f13 = f10 + b10.left + f12;
                float f14 = width / 2.0f;
                float f15 = f13 + f14;
                float f16 = f11 + f14;
                canvas.save();
                canvas.scale(c10, c10, f15, f16);
                canvas.drawCircle(f15, f16, f14 + this.f27984g, org.telegram.ui.ActionBar.f6.Il);
                d9 d9Var = (d9) obj;
                d9Var.f27688a.setImageCoords(f13, f11, width, width);
                d9Var.f27688a.setAlpha((this.f27985i / 255.0f) * n10.c());
                d9Var.f27688a.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z10) {
        d9 d9Var;
        td.h hVar = this.f27981c;
        if (list != null && !list.isEmpty()) {
            if (!z10) {
                hVar.r(null, false);
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) it.next());
                ArrayList arrayList2 = this.h;
                int size = arrayList2.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size) {
                        Object obj = arrayList2.get(i9);
                        i9++;
                        d9Var = (d9) obj;
                        if (d9Var.f27690c == peerDialogId) {
                            break;
                        }
                    } else {
                        d9Var = null;
                        break;
                    }
                }
                if (d9Var == null) {
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            d9Var = (d9) obj2;
                            if (d9Var.f27690c == 0) {
                                break;
                            }
                        } else {
                            d9Var = null;
                            break;
                        }
                    }
                }
                if (d9Var == null) {
                    d9Var = new d9(this, this.f27979a);
                    arrayList2.add(d9Var);
                }
                ImageReceiver imageReceiver = d9Var.f27688a;
                z8 z8Var = d9Var.f27689b;
                if (d9Var.f27690c != peerDialogId) {
                    d9Var.f27690c = peerDialogId;
                    int i11 = this.f27980b;
                    TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(peerDialogId);
                    if (userOrChat != null) {
                        z8Var.j(i11, userOrChat);
                        imageReceiver.setForUserOrChat(userOrChat, z8Var);
                    } else {
                        z8Var.n(peerDialogId, "", "");
                        imageReceiver.clearImage();
                    }
                }
                arrayList.add(d9Var);
                if (this.d && !d9Var.d) {
                    d9Var.d = true;
                    imageReceiver.onAttachedToWindow();
                }
            }
            hVar.r(arrayList, z10);
            return;
        }
        hVar.r(null, z10);
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    @Override
    public final int getAlpha() {
        return this.f27985i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i9) {
        this.f27985i = i9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
