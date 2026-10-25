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
public final class o9 extends Drawable {
    public final ViewGroup f31226a;
    public final int f31227b;
    public boolean d;
    public final int e;
    public final int f31229f;
    public final float f31230g;
    public final oe.j f31228c = new oe.j(new jg.i(this), ds.h, 380);
    public final ArrayList h = new ArrayList();
    public int f31231i = 255;

    public o9(int i10, ViewGroup viewGroup, int i11, int i12, float f7) {
        this.f31227b = i10;
        this.f31226a = viewGroup;
        this.e = i11;
        this.f31229f = i12;
        this.f31230g = f7;
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
                n9 n9Var = (n9) obj;
                if (n9Var.f30925c != 0 && !n9Var.d) {
                    n9Var.d = true;
                    n9Var.f30923a.onAttachedToWindow();
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
                n9 n9Var = (n9) obj;
                if (n9Var.d) {
                    n9Var.d = false;
                    n9Var.f30923a.onDetachedFromWindow();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f31231i != 0) {
            float f7 = bounds.left;
            float f10 = bounds.top;
            oe.j jVar = this.f31228c;
            canvas.saveLayer(f7, f10, f7 + jVar.d.f19344f.f19351a, f10 + this.e, null);
            for (int size = jVar.f19347b.size() - 1; size >= 0; size--) {
                oe.g m10 = jVar.m(size);
                RectF b10 = m10.b();
                Object obj = m10.f19337a;
                float f11 = m10.f19340f.f19351a;
                float c10 = m10.c();
                float width = b10.width() - f11;
                float f12 = f7 + b10.left + f11;
                float f13 = width / 2.0f;
                float f14 = f12 + f13;
                float f15 = f10 + f13;
                canvas.save();
                canvas.scale(c10, c10, f14, f15);
                canvas.drawCircle(f14, f15, f13 + this.f31230g, org.telegram.ui.ActionBar.y6.Nl);
                n9 n9Var = (n9) obj;
                n9Var.f30923a.setImageCoords(f12, f10, width, width);
                n9Var.f30923a.setAlpha((this.f31231i / 255.0f) * m10.c());
                n9Var.f30923a.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z10) {
        n9 n9Var;
        oe.j jVar = this.f31228c;
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
                        n9Var = (n9) obj;
                        if (n9Var.f30925c == peerDialogId) {
                            break;
                        }
                    } else {
                        n9Var = null;
                        break;
                    }
                }
                if (n9Var == null) {
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            n9Var = (n9) obj2;
                            if (n9Var.f30925c == 0) {
                                break;
                            }
                        } else {
                            n9Var = null;
                            break;
                        }
                    }
                }
                if (n9Var == null) {
                    n9Var = new n9(this, this.f31226a);
                    arrayList2.add(n9Var);
                }
                ImageReceiver imageReceiver = n9Var.f30923a;
                j9 j9Var = n9Var.f30924b;
                if (n9Var.f30925c != peerDialogId) {
                    n9Var.f30925c = peerDialogId;
                    int i12 = this.f31227b;
                    TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(peerDialogId);
                    if (userOrChat != null) {
                        j9Var.j(i12, userOrChat);
                        imageReceiver.setForUserOrChat(userOrChat, j9Var);
                    } else {
                        j9Var.n(peerDialogId, "", "");
                        imageReceiver.clearImage();
                    }
                }
                arrayList.add(n9Var);
                if (this.d && !n9Var.d) {
                    n9Var.d = true;
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
        return this.f31231i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f31231i = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
