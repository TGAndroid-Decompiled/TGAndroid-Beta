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
public final class gm extends s4.n0 implements bh.a {
    public Drawable f24596a;
    public final Path f24597b = new Path();
    public final Drawable f24598c;
    public final vl d;
    public final ChatAttachAlertPhotoLayout e;

    public gm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, vl vlVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = vlVar;
        this.f24598c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.camera).mutate();
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        e(null, this.d, aVar, rectF);
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        e(canvas, recyclerView, null, null);
    }

    public final void e(Canvas canvas, RecyclerView recyclerView, ah.a aVar, RectF rectF) {
        int top;
        fm fmVar;
        boolean z10;
        boolean z11;
        boolean z12;
        fm fmVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (!chatAttachAlertPhotoLayout.f22134d0 && !chatAttachAlertPhotoLayout.f22130b0 && chatAttachAlertPhotoLayout.G.e && !chatAttachAlertPhotoLayout.O0 && !chatAttachAlertPhotoLayout.P0) {
            s4.c1 L = recyclerView.L(0);
            if (L != null) {
                top = L.f43005a.getTop();
            } else {
                L = recyclerView.L(chatAttachAlertPhotoLayout.M0);
                if (L != null) {
                    top = (L.f43005a.getTop() - AndroidUtilities.dp(2.0f)) - chatAttachAlertPhotoLayout.K0;
                } else if (aVar != null) {
                    aVar.f417a = true;
                    return;
                } else {
                    return;
                }
            }
            int left = L.f43005a.getLeft();
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
                Drawable drawable = this.f24598c;
                if (aVar != null) {
                    if (this.f24596a != null && ((fmVar2 = chatAttachAlertPhotoLayout.P) == null || !fmVar2.isInited() || chatAttachAlertPhotoLayout.N)) {
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
                    Path path = this.f24597b;
                    path.rewind();
                    float f7 = left;
                    float f10 = top;
                    path.addRoundRect(f7, f10, i11 + dp2, dp + dp2, dp2, dp2, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.f24596a != null && ((fmVar = chatAttachAlertPhotoLayout.P) == null || !fmVar.isInited() || chatAttachAlertPhotoLayout.N)) {
                        this.f24596a.setBounds(left, top, i11, dp);
                        this.f24596a.draw(canvas);
                    }
                    fm fmVar3 = chatAttachAlertPhotoLayout.P;
                    if (fmVar3 != null) {
                        fmVar3.f24333b = true;
                        canvas.save();
                        canvas.clipRect(left, top, i11, dp);
                        canvas.translate(f7, f10);
                        chatAttachAlertPhotoLayout.P.draw(canvas);
                        canvas.restore();
                        chatAttachAlertPhotoLayout.P.f24333b = false;
                    }
                    if (drawable != null) {
                        int dp3 = AndroidUtilities.dp(24.0f);
                        int B = org.telegram.messenger.l0.B(7.0f, i11, dp3);
                        int dp4 = AndroidUtilities.dp(7.0f) + top;
                        drawable.setBounds(B, dp4, B + dp3, dp3 + dp4);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    chatAttachAlertPhotoLayout.E.invalidate();
                }
            }
        } else if (aVar != null) {
            aVar.f417a = true;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        e(canvas, this.d, null, rectF);
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
            this.f24596a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.f24596a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(R.drawable.icplaceholder).mutate();
        }
        vl vlVar = chatAttachAlertPhotoLayout.E;
        if (vlVar != null) {
            vlVar.invalidate();
        }
    }
}
