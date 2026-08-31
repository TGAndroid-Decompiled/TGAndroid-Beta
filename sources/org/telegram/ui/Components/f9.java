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
public final class f9 extends Drawable {
    public final ViewGroup f26790a;
    public final int f26791b;
    public boolean d;
    public final int f26793e;
    public final int f26794f;
    public final float f26795g;
    public final xd.h f26792c = new xd.h(new androidx.biometric.f0(this, 25), pr.h, 380);
    public final ArrayList h = new ArrayList();
    public int f26796i = 255;

    public f9(int i10, ViewGroup viewGroup, int i11, int i12, float f10) {
        this.f26791b = i10;
        this.f26790a = viewGroup;
        this.f26793e = i11;
        this.f26794f = i12;
        this.f26795g = f10;
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
                e9 e9Var = (e9) obj;
                if (e9Var.f26485c != 0 && !e9Var.d) {
                    e9Var.d = true;
                    e9Var.f26483a.onAttachedToWindow();
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
                e9 e9Var = (e9) obj;
                if (e9Var.d) {
                    e9Var.d = false;
                    e9Var.f26483a.onDetachedFromWindow();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f26796i != 0) {
            float f10 = bounds.left;
            float f11 = bounds.top;
            xd.h hVar = this.f26792c;
            canvas.saveLayer(f10, f11, f10 + hVar.d.f50521f.f50529a, f11 + this.f26793e, null);
            for (int size = hVar.f50524b.size() - 1; size >= 0; size--) {
                xd.e n10 = hVar.n(size);
                RectF b10 = n10.b();
                Object obj = n10.f50512a;
                float f12 = n10.f50516f.f50529a;
                float c3 = n10.c();
                float width = b10.width() - f12;
                float f13 = f10 + b10.left + f12;
                float f14 = width / 2.0f;
                float f15 = f13 + f14;
                float f16 = f11 + f14;
                canvas.save();
                canvas.scale(c3, c3, f15, f16);
                canvas.drawCircle(f15, f16, f14 + this.f26795g, org.telegram.ui.ActionBar.k6.Il);
                e9 e9Var = (e9) obj;
                e9Var.f26483a.setImageCoords(f13, f11, width, width);
                e9Var.f26483a.setAlpha((this.f26796i / 255.0f) * n10.c());
                e9Var.f26483a.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z4) {
        e9 e9Var;
        xd.h hVar = this.f26792c;
        if (list != null && !list.isEmpty()) {
            if (!z4) {
                hVar.r(null, false);
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
                        e9Var = (e9) obj;
                        if (e9Var.f26485c == peerDialogId) {
                            break;
                        }
                    } else {
                        e9Var = null;
                        break;
                    }
                }
                if (e9Var == null) {
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            e9Var = (e9) obj2;
                            if (e9Var.f26485c == 0) {
                                break;
                            }
                        } else {
                            e9Var = null;
                            break;
                        }
                    }
                }
                if (e9Var == null) {
                    e9Var = new e9(this, this.f26790a);
                    arrayList2.add(e9Var);
                }
                ImageReceiver imageReceiver = e9Var.f26483a;
                z8 z8Var = e9Var.f26484b;
                if (e9Var.f26485c != peerDialogId) {
                    e9Var.f26485c = peerDialogId;
                    int i12 = this.f26791b;
                    TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(peerDialogId);
                    if (userOrChat != null) {
                        z8Var.j(i12, userOrChat);
                        imageReceiver.setForUserOrChat(userOrChat, z8Var);
                    } else {
                        z8Var.n(peerDialogId, "", "");
                        imageReceiver.clearImage();
                    }
                }
                arrayList.add(e9Var);
                if (this.d && !e9Var.d) {
                    e9Var.d = true;
                    imageReceiver.onAttachedToWindow();
                }
            }
            hVar.r(arrayList, z4);
            return;
        }
        hVar.r(null, z4);
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    @Override
    public final int getAlpha() {
        return this.f26796i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26796i = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
