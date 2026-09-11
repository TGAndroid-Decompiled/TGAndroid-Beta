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
public final class n9 extends Drawable {
    public final ViewGroup f28690a;
    public final int f28691b;
    public boolean d;
    public final int f28693e;
    public final int f28694f;
    public final float f28695g;
    public final le.j f28692c = new le.j(new ji.u4(this, 10), pr.h, 380);
    public final ArrayList h = new ArrayList();
    public int f28696i = 255;

    public n9(int i10, ViewGroup viewGroup, int i11, int i12, float f7) {
        this.f28691b = i10;
        this.f28690a = viewGroup;
        this.f28693e = i11;
        this.f28694f = i12;
        this.f28695g = f7;
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
                m9 m9Var = (m9) obj;
                if (m9Var.f28418c != 0 && !m9Var.d) {
                    m9Var.d = true;
                    m9Var.f28416a.onAttachedToWindow();
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
                m9 m9Var = (m9) obj;
                if (m9Var.d) {
                    m9Var.d = false;
                    m9Var.f28416a.onDetachedFromWindow();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f28696i != 0) {
            float f7 = bounds.left;
            float f10 = bounds.top;
            le.j jVar = this.f28692c;
            canvas.saveLayer(f7, f10, f7 + jVar.d.f15388f.f15396a, f10 + this.f28693e, null);
            for (int size = jVar.f15391b.size() - 1; size >= 0; size--) {
                le.g n10 = jVar.n(size);
                RectF b10 = n10.b();
                Object obj = n10.f15379a;
                float f11 = n10.f15383f.f15396a;
                float c10 = n10.c();
                float width = b10.width() - f11;
                float f12 = f7 + b10.left + f11;
                float f13 = width / 2.0f;
                float f14 = f12 + f13;
                float f15 = f10 + f13;
                canvas.save();
                canvas.scale(c10, c10, f14, f15);
                canvas.drawCircle(f14, f15, f13 + this.f28695g, org.telegram.ui.ActionBar.j6.Il);
                m9 m9Var = (m9) obj;
                m9Var.f28416a.setImageCoords(f12, f10, width, width);
                m9Var.f28416a.setAlpha((this.f28696i / 255.0f) * n10.c());
                m9Var.f28416a.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z10) {
        m9 m9Var;
        le.j jVar = this.f28692c;
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
                        m9Var = (m9) obj;
                        if (m9Var.f28418c == peerDialogId) {
                            break;
                        }
                    } else {
                        m9Var = null;
                        break;
                    }
                }
                if (m9Var == null) {
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            m9Var = (m9) obj2;
                            if (m9Var.f28418c == 0) {
                                break;
                            }
                        } else {
                            m9Var = null;
                            break;
                        }
                    }
                }
                if (m9Var == null) {
                    m9Var = new m9(this, this.f28690a);
                    arrayList2.add(m9Var);
                }
                ImageReceiver imageReceiver = m9Var.f28416a;
                i9 i9Var = m9Var.f28417b;
                if (m9Var.f28418c != peerDialogId) {
                    m9Var.f28418c = peerDialogId;
                    int i12 = this.f28691b;
                    TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(peerDialogId);
                    if (userOrChat != null) {
                        i9Var.j(i12, userOrChat);
                        imageReceiver.setForUserOrChat(userOrChat, i9Var);
                    } else {
                        i9Var.n(peerDialogId, "", "");
                        imageReceiver.clearImage();
                    }
                }
                arrayList.add(m9Var);
                if (this.d && !m9Var.d) {
                    m9Var.d = true;
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
        return this.f28696i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28696i = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
