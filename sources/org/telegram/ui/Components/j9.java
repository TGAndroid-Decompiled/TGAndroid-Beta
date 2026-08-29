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
public final class j9 extends Drawable {
    public final ViewGroup f29619a;
    public final int f29620b;
    public boolean d;
    public final int f29622e;
    public final int f29623f;
    public final float f29624g;
    public final vd.i f29621c = new vd.i(new nh.d6(this, 6), jr.h, 380);
    public final ArrayList h = new ArrayList();
    public int f29625i = 255;

    public j9(int i10, ViewGroup viewGroup, int i11, int i12, float f9) {
        this.f29620b = i10;
        this.f29619a = viewGroup;
        this.f29622e = i11;
        this.f29623f = i12;
        this.f29624g = f9;
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
                i9 i9Var = (i9) obj;
                if (i9Var.f29352c != 0 && !i9Var.d) {
                    i9Var.d = true;
                    i9Var.f29350a.onAttachedToWindow();
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
                i9 i9Var = (i9) obj;
                if (i9Var.d) {
                    i9Var.d = false;
                    i9Var.f29350a.onDetachedFromWindow();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f29625i != 0) {
            float f9 = bounds.left;
            float f10 = bounds.top;
            vd.i iVar = this.f29621c;
            canvas.saveLayer(f9, f10, f9 + iVar.d.f49523f.f49531a, f10 + this.f29622e, null);
            for (int size = iVar.f49526b.size() - 1; size >= 0; size--) {
                vd.f n10 = iVar.n(size);
                RectF b10 = n10.b();
                Object obj = n10.f49514a;
                float f11 = n10.f49518f.f49531a;
                float c3 = n10.c();
                float width = b10.width() - f11;
                float f12 = f9 + b10.left + f11;
                float f13 = width / 2.0f;
                float f14 = f12 + f13;
                float f15 = f10 + f13;
                canvas.save();
                canvas.scale(c3, c3, f14, f15);
                canvas.drawCircle(f14, f15, f13 + this.f29624g, org.telegram.ui.ActionBar.g6.Il);
                i9 i9Var = (i9) obj;
                i9Var.f29350a.setImageCoords(f12, f10, width, width);
                i9Var.f29350a.setAlpha((this.f29625i / 255.0f) * n10.c());
                i9Var.f29350a.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z10) {
        i9 i9Var;
        vd.i iVar = this.f29621c;
        if (list != null && !list.isEmpty()) {
            if (!z10) {
                iVar.r(null, false);
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
                        i9Var = (i9) obj;
                        if (i9Var.f29352c == peerDialogId) {
                            break;
                        }
                    } else {
                        i9Var = null;
                        break;
                    }
                }
                if (i9Var == null) {
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            i9Var = (i9) obj2;
                            if (i9Var.f29352c == 0) {
                                break;
                            }
                        } else {
                            i9Var = null;
                            break;
                        }
                    }
                }
                if (i9Var == null) {
                    i9Var = new i9(this, this.f29619a);
                    arrayList2.add(i9Var);
                }
                ImageReceiver imageReceiver = i9Var.f29350a;
                e9 e9Var = i9Var.f29351b;
                if (i9Var.f29352c != peerDialogId) {
                    i9Var.f29352c = peerDialogId;
                    int i12 = this.f29620b;
                    TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(peerDialogId);
                    if (userOrChat != null) {
                        e9Var.j(i12, userOrChat);
                        imageReceiver.setForUserOrChat(userOrChat, e9Var);
                    } else {
                        e9Var.n(peerDialogId, "", "");
                        imageReceiver.clearImage();
                    }
                }
                arrayList.add(i9Var);
                if (this.d && !i9Var.d) {
                    i9Var.d = true;
                    imageReceiver.onAttachedToWindow();
                }
            }
            iVar.r(arrayList, z10);
            return;
        }
        iVar.r(null, z10);
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    @Override
    public final int getAlpha() {
        return this.f29625i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29625i = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
