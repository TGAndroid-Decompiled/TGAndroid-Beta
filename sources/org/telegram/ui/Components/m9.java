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
public final class m9 extends Drawable {
    public final ViewGroup f26409a;
    public final int f26410b;
    public boolean d;
    public final int e;
    public final int f26412f;
    public final float f26413g;
    public final le.k f26411c = new le.k(new l.d(this), rr.h, 380);
    public final ArrayList h = new ArrayList();
    public int f26414i = 255;

    public m9(int i10, ViewGroup viewGroup, int i11, int i12, float f7) {
        this.f26410b = i10;
        this.f26409a = viewGroup;
        this.e = i11;
        this.f26412f = i12;
        this.f26413g = f7;
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
                l9 l9Var = (l9) obj;
                if (l9Var.f26048c != 0 && !l9Var.d) {
                    l9Var.d = true;
                    l9Var.f26046a.onAttachedToWindow();
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
                l9 l9Var = (l9) obj;
                if (l9Var.d) {
                    l9Var.d = false;
                    l9Var.f26046a.onDetachedFromWindow();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f26414i != 0) {
            float f7 = bounds.left;
            float f10 = bounds.top;
            le.k kVar = this.f26411c;
            canvas.saveLayer(f7, f10, f7 + kVar.d.f14217f.f14224a, f10 + this.e, null);
            for (int size = kVar.f14220b.size() - 1; size >= 0; size--) {
                le.h n10 = kVar.n(size);
                RectF b10 = n10.b();
                Object obj = n10.f14210a;
                float f11 = n10.f14213f.f14224a;
                float c10 = n10.c();
                float width = b10.width() - f11;
                float f12 = f7 + b10.left + f11;
                float f13 = width / 2.0f;
                float f14 = f12 + f13;
                float f15 = f10 + f13;
                canvas.save();
                canvas.scale(c10, c10, f14, f15);
                canvas.drawCircle(f14, f15, f13 + this.f26413g, org.telegram.ui.ActionBar.h6.Il);
                l9 l9Var = (l9) obj;
                l9Var.f26046a.setImageCoords(f12, f10, width, width);
                l9Var.f26046a.setAlpha((this.f26414i / 255.0f) * n10.c());
                l9Var.f26046a.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z10) {
        l9 l9Var;
        le.k kVar = this.f26411c;
        if (list != null && !list.isEmpty()) {
            if (!z10) {
                kVar.r(null, false);
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
                        l9Var = (l9) obj;
                        if (l9Var.f26048c == peerDialogId) {
                            break;
                        }
                    } else {
                        l9Var = null;
                        break;
                    }
                }
                if (l9Var == null) {
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            l9Var = (l9) obj2;
                            if (l9Var.f26048c == 0) {
                                break;
                            }
                        } else {
                            l9Var = null;
                            break;
                        }
                    }
                }
                if (l9Var == null) {
                    l9Var = new l9(this, this.f26409a);
                    arrayList2.add(l9Var);
                }
                ImageReceiver imageReceiver = l9Var.f26046a;
                h9 h9Var = l9Var.f26047b;
                if (l9Var.f26048c != peerDialogId) {
                    l9Var.f26048c = peerDialogId;
                    int i12 = this.f26410b;
                    TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(peerDialogId);
                    if (userOrChat != null) {
                        h9Var.j(i12, userOrChat);
                        imageReceiver.setForUserOrChat(userOrChat, h9Var);
                    } else {
                        h9Var.n(peerDialogId, "", "");
                        imageReceiver.clearImage();
                    }
                }
                arrayList.add(l9Var);
                if (this.d && !l9Var.d) {
                    l9Var.d = true;
                    imageReceiver.onAttachedToWindow();
                }
            }
            kVar.r(arrayList, z10);
            return;
        }
        kVar.r(null, z10);
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    @Override
    public final int getAlpha() {
        return this.f26414i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26414i = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
