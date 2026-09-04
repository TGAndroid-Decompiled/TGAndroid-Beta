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
public final class em extends s4.n0 implements ch.a {
    public Drawable f25729a;
    public final Path f25730b = new Path();
    public final Drawable f25731c;
    public final tl d;
    public final ChatAttachAlertPhotoLayout f25732e;

    public em(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, tl tlVar) {
        this.f25732e = chatAttachAlertPhotoLayout;
        this.d = tlVar;
        this.f25731c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        d(canvas, recyclerView, null, null);
    }

    public final void d(Canvas canvas, RecyclerView recyclerView, bh.a aVar, RectF rectF) {
        int top;
        dm dmVar;
        boolean z10;
        boolean z11;
        boolean z12;
        dm dmVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25732e;
        if (!chatAttachAlertPhotoLayout.f23842d0 && !chatAttachAlertPhotoLayout.f23838b0 && chatAttachAlertPhotoLayout.G.f26753e && !chatAttachAlertPhotoLayout.O0 && !chatAttachAlertPhotoLayout.P0) {
            s4.c1 K = recyclerView.K(0);
            if (K != null) {
                top = K.f45738a.getTop();
            } else {
                K = recyclerView.K(chatAttachAlertPhotoLayout.M0);
                if (K != null) {
                    top = (K.f45738a.getTop() - AndroidUtilities.dp(2.0f)) - chatAttachAlertPhotoLayout.K0;
                } else if (aVar != null) {
                    aVar.f2648a = true;
                    return;
                } else {
                    return;
                }
            }
            int left = K.f45738a.getLeft();
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
                Drawable drawable = this.f25731c;
                if (aVar != null) {
                    if (this.f25729a != null && ((dmVar2 = chatAttachAlertPhotoLayout.P) == null || !dmVar2.isInited() || chatAttachAlertPhotoLayout.N)) {
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
                    Path path = this.f25730b;
                    path.rewind();
                    float f7 = left;
                    float f10 = top;
                    path.addRoundRect(f7, f10, i11 + dp2, dp + dp2, dp2, dp2, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.f25729a != null && ((dmVar = chatAttachAlertPhotoLayout.P) == null || !dmVar.isInited() || chatAttachAlertPhotoLayout.N)) {
                        this.f25729a.setBounds(left, top, i11, dp);
                        this.f25729a.draw(canvas);
                    }
                    dm dmVar3 = chatAttachAlertPhotoLayout.P;
                    if (dmVar3 != null) {
                        dmVar3.f25424b = true;
                        canvas.save();
                        canvas.clipRect(left, top, i11, dp);
                        canvas.translate(f7, f10);
                        chatAttachAlertPhotoLayout.P.draw(canvas);
                        canvas.restore();
                        chatAttachAlertPhotoLayout.P.f25424b = false;
                    }
                    if (drawable != null) {
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int B = org.telegram.messenger.w1.B(7.0f, i11, dp3);
                        int dp4 = AndroidUtilities.dp(7.0f) + top;
                        drawable.setBounds(B, dp4, B + dp3, dp3 + dp4);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    chatAttachAlertPhotoLayout.E.invalidate();
                }
            }
        } else if (aVar != null) {
            aVar.f2648a = true;
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
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f25732e;
        if (bitmap != null) {
            this.f25729a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.f25729a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.icplaceholder).mutate();
        }
        tl tlVar = chatAttachAlertPhotoLayout.E;
        if (tlVar != null) {
            tlVar.invalidate();
        }
    }
}
