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
public final class l9 extends Drawable {
    public final ViewGroup f24905a;
    public final int f24906b;
    public boolean d;
    public final int e;
    public final int f24908f;
    public final float f24909g;
    public final le.j f24907c = new le.j(new m.g3(this, 6), wr.h, 380);
    public final ArrayList h = new ArrayList();
    public int f24910i = 255;

    public l9(int i10, ViewGroup viewGroup, int i11, int i12, float f7) {
        this.f24906b = i10;
        this.f24905a = viewGroup;
        this.e = i11;
        this.f24908f = i12;
        this.f24909g = f7;
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
                k9 k9Var = (k9) obj;
                if (k9Var.f24675c != 0 && !k9Var.d) {
                    k9Var.d = true;
                    k9Var.f24673a.onAttachedToWindow();
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
                k9 k9Var = (k9) obj;
                if (k9Var.d) {
                    k9Var.d = false;
                    k9Var.f24673a.onDetachedFromWindow();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f24910i != 0) {
            float f7 = bounds.left;
            float f10 = bounds.top;
            le.j jVar = this.f24907c;
            canvas.saveLayer(f7, f10, f7 + jVar.d.f12886f.f12893a, f10 + this.e, null);
            for (int size = jVar.f12889b.size() - 1; size >= 0; size--) {
                le.g n10 = jVar.n(size);
                RectF b10 = n10.b();
                Object obj = n10.f12879a;
                float f11 = n10.f12882f.f12893a;
                float c10 = n10.c();
                float width = b10.width() - f11;
                float f12 = f7 + b10.left + f11;
                float f13 = width / 2.0f;
                float f14 = f12 + f13;
                float f15 = f10 + f13;
                canvas.save();
                canvas.scale(c10, c10, f14, f15);
                canvas.drawCircle(f14, f15, f13 + this.f24909g, org.telegram.ui.ActionBar.j6.Il);
                k9 k9Var = (k9) obj;
                k9Var.f24673a.setImageCoords(f12, f10, width, width);
                k9Var.f24673a.setAlpha((this.f24910i / 255.0f) * n10.c());
                k9Var.f24673a.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z10) {
        k9 k9Var;
        le.j jVar = this.f24907c;
        if (list != null && !list.isEmpty()) {
            if (!z10) {
                jVar.r(null, false);
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
                        k9Var = (k9) obj;
                        if (k9Var.f24675c == peerDialogId) {
                            break;
                        }
                    } else {
                        k9Var = null;
                        break;
                    }
                }
                if (k9Var == null) {
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            k9Var = (k9) obj2;
                            if (k9Var.f24675c == 0) {
                                break;
                            }
                        } else {
                            k9Var = null;
                            break;
                        }
                    }
                }
                if (k9Var == null) {
                    k9Var = new k9(this, this.f24905a);
                    arrayList2.add(k9Var);
                }
                ImageReceiver imageReceiver = k9Var.f24673a;
                g9 g9Var = k9Var.f24674b;
                if (k9Var.f24675c != peerDialogId) {
                    k9Var.f24675c = peerDialogId;
                    int i12 = this.f24906b;
                    TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(peerDialogId);
                    if (userOrChat != null) {
                        g9Var.j(i12, userOrChat);
                        imageReceiver.setForUserOrChat(userOrChat, g9Var);
                    } else {
                        g9Var.n(peerDialogId, "", "");
                        imageReceiver.clearImage();
                    }
                }
                arrayList.add(k9Var);
                if (this.d && !k9Var.d) {
                    k9Var.d = true;
                    imageReceiver.onAttachedToWindow();
                }
            }
            jVar.r(arrayList, z10);
            return;
        }
        jVar.r(null, z10);
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    @Override
    public final int getAlpha() {
        return this.f24910i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24910i = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
