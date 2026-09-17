package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
import org.telegram.messenger.AndroidUtilities;
public final class ha {
    public int f24606a;
    public final View f24607b;
    public final ArrayList f24608c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f24609f;
    public EGLContext f24610g;
    public final Object h;
    public int f24611i;
    public ci.ac f24612j;
    public Object f24613k;
    public Object f24614l;
    public na f24615m;
    public final ma f24616n;
    public Bitmap f24617o;
    public int f24618p;

    public ha(View view) {
        ArrayList arrayList = new ArrayList();
        this.f24608c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f24609f = new Object();
        this.h = new Object();
        this.f24616n = new ma(0, new ng(this, 14));
        this.f24618p = 0;
        this.f24607b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new ai.u2(this, 5));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f24609f) {
            try {
                if (this.f24610g == null) {
                    this.f24610g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        na naVar = this.f24615m;
        if (naVar == null) {
            return this.f24617o;
        }
        synchronized (naVar.f26416n) {
            try {
                if (!naVar.f26419q) {
                    bitmap = null;
                } else {
                    bitmap = naVar.f26418p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f24617o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f24614l != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((la) obj).f25868b.invalidate();
        }
        ArrayList arrayList2 = this.e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        na naVar = this.f24615m;
        if (naVar != null) {
            synchronized (naVar.f26416n) {
                naVar.f26419q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f24618p;
        this.f24618p = i10 + 1;
        sb2.append(i10);
        this.f24617o = this.f24616n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.ac acVar, Object obj) {
        this.f24612j = acVar;
        this.f24613k = obj;
        this.f24611i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f24614l = renderNode2;
            return;
        }
        this.f24614l = null;
    }
}
