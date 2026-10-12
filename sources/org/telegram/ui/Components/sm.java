package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class sm extends s4.m0 implements ch.a {
    public Drawable f29158a;
    public final Path f29159b = new Path();
    public final Drawable f29160c;
    public final hm d;
    public final ChatAttachAlertPhotoLayout e;

    public sm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, hm hmVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = hmVar;
        this.f29160c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        d(canvas, recyclerView, null, null);
    }

    public final void d(Canvas canvas, RecyclerView recyclerView, bh.a aVar, RectF rectF) {
        int top;
        rm rmVar;
        boolean z10;
        boolean z11;
        boolean z12;
        rm rmVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (!chatAttachAlertPhotoLayout.f23029d0 && !chatAttachAlertPhotoLayout.f23025b0 && chatAttachAlertPhotoLayout.G.e && !chatAttachAlertPhotoLayout.O0 && !chatAttachAlertPhotoLayout.P0) {
            s4.b1 K = recyclerView.K(0);
            if (K != null) {
                top = K.f44838a.getTop();
            } else {
                K = recyclerView.K(chatAttachAlertPhotoLayout.M0);
                if (K != null) {
                    top = (K.f44838a.getTop() - AndroidUtilities.dp(2.0f)) - chatAttachAlertPhotoLayout.K0;
                } else if (aVar != null) {
                    aVar.f2740a = true;
                    return;
                } else {
                    return;
                }
            }
            int left = K.f44838a.getLeft();
            int i10 = chatAttachAlertPhotoLayout.K0;
            int i11 = left + i10;
            int dp = AndroidUtilities.dp(2.0f) + (i10 * 2) + top;
            if (aVar != null) {
                aVar.a(left);
                aVar.a(top);
                aVar.a(i11);
                aVar.a(dp);
            }
            if (rectF == null || rectF.intersects(left, top, i11, dp)) {
                Drawable drawable = this.f29160c;
                if (aVar != null) {
                    if (this.f29158a != null && ((rmVar2 = chatAttachAlertPhotoLayout.P) == null || !rmVar2.isInited() || chatAttachAlertPhotoLayout.N)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    aVar.b(z10);
                    if (chatAttachAlertPhotoLayout.P != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    aVar.b(z11);
                    if (drawable != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    aVar.b(z12);
                }
                if (canvas != null) {
                    float dp2 = AndroidUtilities.dp(16.0f);
                    Path path = this.f29159b;
                    path.rewind();
                    float f7 = left;
                    float f10 = top;
                    path.addRoundRect(f7, f10, i11 + dp2, dp + dp2, dp2, dp2, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.f29158a != null && ((rmVar = chatAttachAlertPhotoLayout.P) == null || !rmVar.isInited() || chatAttachAlertPhotoLayout.N)) {
                        this.f29158a.setBounds(left, top, i11, dp);
                        this.f29158a.draw(canvas);
                    }
                    rm rmVar3 = chatAttachAlertPhotoLayout.P;
                    if (rmVar3 != null) {
                        rmVar3.f28871b = true;
                        canvas.save();
                        canvas.clipRect(left, top, i11, dp);
                        canvas.translate(f7, f10);
                        chatAttachAlertPhotoLayout.P.draw(canvas);
                        canvas.restore();
                        chatAttachAlertPhotoLayout.P.f28871b = false;
                    }
                    if (drawable != null) {
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int D = org.telegram.messenger.q.D(7.0f, i11, dp3);
                        int dp4 = AndroidUtilities.dp(7.0f) + top;
                        drawable.setBounds(D, dp4, D + dp3, dp3 + dp4);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    chatAttachAlertPhotoLayout.E.invalidate();
                }
            }
        } else if (aVar != null) {
            aVar.f2740a = true;
        }
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        d(null, this.d, aVar, rectF);
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        d(canvas, this.d, null, rectF);
    }

    public final void g() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (bitmap != null) {
            this.f29158a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.f29158a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.icplaceholder).mutate();
        }
        hm hmVar = chatAttachAlertPhotoLayout.E;
        if (hmVar != null) {
            hmVar.invalidate();
        }
    }
}
