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

public final class z9 {

    public int f35202a;

    public final View f35203b;

    public final ArrayList f35204c;
    public final ArrayList d;

    public final ArrayList f35205e;

    public final Object f35206f;

    public EGLContext f35207g;
    public final Object h;

    public int f35208i;

    public lh.fb f35209j;

    public Object f35210k;

    public Object f35211l;

    public fa f35212m;

    public final ea f35213n;

    public Bitmap f35214o;

    public int f35215p;

    public z9(View view) {
        ArrayList arrayList = new ArrayList();
        this.f35204c = arrayList;
        this.d = new ArrayList();
        this.f35205e = new ArrayList();
        this.f35206f = new Object();
        this.h = new Object();
        this.f35213n = new ea(0, new bg(this, 14));
        this.f35215p = 0;
        this.f35203b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new bf.b(this, 9));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f35206f) {
            try {
                if (this.f35207g == null) {
                    this.f35207g = eGLContext;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        fa faVar = this.f35212m;
        if (faVar == null) {
            return this.f35214o;
        }
        synchronized (faVar.f28329n) {
            try {
                bitmap = !faVar.f28332q ? null : faVar.f28331p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bitmap == null ? this.f35214o : bitmap;
    }

    public final boolean c() {
        return this.f35211l != null;
    }

    public final void d() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((da) obj).f27684b.invalidate();
        }
        ArrayList arrayList2 = this.f35205e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        fa faVar = this.f35212m;
        if (faVar != null) {
            synchronized (faVar.f28329n) {
                faVar.f28332q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f35215p;
        this.f35215p = i10 + 1;
        sb2.append(i10);
        this.f35214o = this.f35213n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(lh.fb fbVar, Object obj) {
        this.f35209j = fbVar;
        this.f35210k = obj;
        this.f35208i = -14737633;
        if (obj == null || Build.VERSION.SDK_INT < 31) {
            this.f35211l = null;
            return;
        }
        RenderNode renderNode = (RenderNode) obj;
        RenderNode renderNode2 = new RenderNode("blurRenderNode");
        renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
        renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
        RecordingCanvas recordingCanvasBeginRecording = renderNode2.beginRecording();
        recordingCanvasBeginRecording.drawColor(-14737633);
        recordingCanvasBeginRecording.drawRenderNode(renderNode);
        renderNode2.endRecording();
        this.f35211l = renderNode2;
    }
}
