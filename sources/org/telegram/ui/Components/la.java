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
    public int f28132a;
    public final View f28133b;
    public final ArrayList f28134c;
    public final ArrayList d;
    public final ArrayList f28135e;
    public final Object f28136f;
    public EGLContext f28137g;
    public final Object h;
    public int f28138i;
    public ci.xb f28139j;
    public Object f28140k;
    public Object f28141l;
    public ra f28142m;
    public final qa f28143n;
    public Bitmap f28144o;
    public int f28145p;

    public la(View view) {
        ArrayList arrayList = new ArrayList();
        this.f28134c = arrayList;
        this.d = new ArrayList();
        this.f28135e = new ArrayList();
        this.f28136f = new Object();
        this.h = new Object();
        this.f28143n = new qa(0, new tg(this, 14));
        this.f28145p = 0;
        this.f28133b = view;
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
        synchronized (this.f28136f) {
            try {
                if (this.f28137g == null) {
                    this.f28137g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ra raVar = this.f28142m;
        if (raVar == null) {
            return this.f28144o;
        }
        synchronized (raVar.f30126n) {
            try {
                if (!raVar.f30129q) {
                    bitmap = null;
                } else {
                    bitmap = raVar.f30128p;
                }
            } finally {
            }
        }
        if (bitmap == null) {
            return this.f28144o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.f28141l != null) {
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
            ((pa) obj).f29457b.invalidate();
        }
        ArrayList arrayList2 = this.f28135e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ra raVar = this.f28142m;
        if (raVar != null) {
            synchronized (raVar.f30126n) {
                raVar.f30129q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i10 = this.f28145p;
        this.f28145p = i10 + 1;
        sb2.append(i10);
        this.f28144o = this.f28143n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(ci.xb xbVar, Object obj) {
        this.f28139j = xbVar;
        this.f28140k = obj;
        this.f28138i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.f28141l = renderNode2;
            return;
        }
        this.f28141l = null;
    }
}
