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
public final class k9 extends Drawable {
    public final ViewGroup f25598a;
    public final int f25599b;
    public boolean d;
    public final int e;
    public final int f25601f;
    public final float f25602g;
    public final le.j f25600c = new le.j(new k2.u(this, 11), qr.h, 380);
    public final ArrayList h = new ArrayList();
    public int f25603i = 255;

    public k9(int i10, ViewGroup viewGroup, int i11, int i12, float f7) {
        this.f25599b = i10;
        this.f25598a = viewGroup;
        this.e = i11;
        this.f25601f = i12;
        this.f25602g = f7;
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
                j9 j9Var = (j9) obj;
                if (j9Var.f25193c != 0 && !j9Var.d) {
                    j9Var.d = true;
                    j9Var.f25191a.onAttachedToWindow();
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
                j9 j9Var = (j9) obj;
                if (j9Var.d) {
                    j9Var.d = false;
                    j9Var.f25191a.onDetachedFromWindow();
                }
            }
        }
    }

    public final void c(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f25603i != 0) {
            float f7 = bounds.left;
            float f10 = bounds.top;
            le.j jVar = this.f25600c;
            canvas.saveLayer(f7, f10, f7 + jVar.d.f14001f.f14008a, f10 + this.e, null);
            for (int size = jVar.f14004b.size() - 1; size >= 0; size--) {
                le.g n10 = jVar.n(size);
                RectF b10 = n10.b();
                Object obj = n10.f13994a;
                float f11 = n10.f13997f.f14008a;
                float c10 = n10.c();
                float width = b10.width() - f11;
                float f12 = f7 + b10.left + f11;
                float f13 = width / 2.0f;
                float f14 = f12 + f13;
                float f15 = f10 + f13;
                canvas.save();
                canvas.scale(c10, c10, f14, f15);
                canvas.drawCircle(f14, f15, f13 + this.f25602g, org.telegram.ui.ActionBar.j6.Il);
                j9 j9Var = (j9) obj;
                j9Var.f25191a.setImageCoords(f12, f10, width, width);
                j9Var.f25191a.setAlpha((this.f25603i / 255.0f) * n10.c());
                j9Var.f25191a.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void d(List list, boolean z10) {
        j9 j9Var;
        le.j jVar = this.f25600c;
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
                        j9Var = (j9) obj;
                        if (j9Var.f25193c == peerDialogId) {
                            break;
                        }
                    } else {
                        j9Var = null;
                        break;
                    }
                }
                if (j9Var == null) {
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            j9Var = (j9) obj2;
                            if (j9Var.f25193c == 0) {
                                break;
                            }
                        } else {
                            j9Var = null;
                            break;
                        }
                    }
                }
                if (j9Var == null) {
                    j9Var = new j9(this, this.f25598a);
                    arrayList2.add(j9Var);
                }
                ImageReceiver imageReceiver = j9Var.f25191a;
                f9 f9Var = j9Var.f25192b;
                if (j9Var.f25193c != peerDialogId) {
                    j9Var.f25193c = peerDialogId;
                    int i12 = this.f25599b;
                    TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(peerDialogId);
                    if (userOrChat != null) {
                        f9Var.j(i12, userOrChat);
                        imageReceiver.setForUserOrChat(userOrChat, f9Var);
                    } else {
                        f9Var.n(peerDialogId, "", "");
                        imageReceiver.clearImage();
                    }
                }
                arrayList.add(j9Var);
                if (this.d && !j9Var.d) {
                    j9Var.d = true;
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
        return this.f25603i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25603i = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
