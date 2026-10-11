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
public final class la {
    public int f28264a;
    public final View f28265b;
    public final ArrayList f28266c;
    public final ArrayList d;
    public final ArrayList f28267e;
    public final Object f28268f;
    public EGLContext f28269g;
    public final Object h;
    public int f28270i;
    public ci.xb f28271j;
    public Object f28272k;
    public Object f28273l;
    public ra f28274m;
    public final qa f28275n;
    public Bitmap f28276o;
    public int f28277p;

    public la(View view) {
        ArrayList arrayList = new ArrayList();
        this.f28266c = arrayList;
        this.d = new ArrayList();
        this.f28267e = new ArrayList();
        this.f28268f = new Object();
        this.h = new Object();
        this.f28275n = new qa(0, new rg(this, 14));
        this.f28277p = 0;
        this.f28265b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new ai.v2(this, 5));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f28268f) {
            try {
                if (this.f28269g == null) {
                    this.f28269g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ra raVar = this.f28274m;
        if (raVar == null) {
            return this.f28276o;
        }
        synchronized (raVar.f30424n) {
            try {
                if (!raVar.f30427q) {
                    bitmap = null;
                } else {
                    bitmap = raVar.f30426p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f28276o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f28273l != null) {
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
            ((pa) obj).f29687b.invalidate();
        }
        ArrayList arrayList2 = this.f28267e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ra raVar = this.f28274m;
        if (raVar != null) {
            synchronized (raVar.f30424n) {
                raVar.f30427q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f28277p;
        this.f28277p = i10 + 1;
        sb2.append(i10);
        this.f28276o = this.f28275n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.xb xbVar, Object obj) {
        this.f28271j = xbVar;
        this.f28272k = obj;
        this.f28270i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f28273l = renderNode2;
            return;
        }
        this.f28273l = null;
    }
}
