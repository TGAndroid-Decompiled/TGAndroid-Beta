package org.telegram.ui.Components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public abstract class bg extends ft {
    public kc f33274e2;
    public final ChatActivityEnterView f33275f2;

    public bg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f33275f2 = chatActivityEnterView;
    }

    @Override
    public final void E() {
        cg cgVar = this.f33275f2.H3;
        if (cgVar != null) {
            cgVar.i2();
        }
    }

    @Override
    public final void F() {
        cg cgVar = this.f33275f2.H3;
        if (cgVar != null) {
            cgVar.d();
        }
    }

    public final void J(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.an anVar = this.f33275f2.f32319x3;
        if (anVar != null && anVar.z()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.f22416e.c(new yf(this, uri, org.telegram.messenger.g0.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), z10), 0));
    }

    public final void K(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f33275f2;
        org.telegram.ui.an anVar = chatActivityEnterView.f32319x3;
        if (anVar != null && anVar.getParentActivity() != null) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList.get(0);
            if (chatActivityEnterView.f32209h3) {
                org.telegram.messenger.g0.v1(this);
                org.telegram.messenger.g0.i3(new a9.h(this, arrayList, file, false, 9), 100L);
                return;
            }
            PhotoViewer.p1().I2(null, anVar, chatActivityEnterView.E4);
            PhotoViewer.p1().f2(arrayList, 0, 2, false, new ag(this, ffVar, file), chatActivityEnterView.f32319x3);
        }
    }

    public final void L(ff ffVar, boolean z10, int i7, int i10) {
        org.telegram.messenger.gj threadMessage;
        org.telegram.messenger.gj threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.f33275f2;
        org.telegram.ui.an anVar = chatActivityEnterView.f32319x3;
        org.telegram.ui.bg0 bg0Var = chatActivityEnterView.M0;
        org.telegram.messenger.fw fwVar = null;
        if (bg0Var != null) {
            bg0Var.h(true);
            chatActivityEnterView.M0 = null;
        }
        org.telegram.ui.qm qmVar = chatActivityEnterView.D3;
        if (qmVar != null && anVar != null && qmVar.f50647f) {
            anVar.yc();
            return;
        }
        t0.h hVar = (t0.h) ffVar.f34586b;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            org.telegram.messenger.c cVar = chatActivityEnterView.S;
            Uri c10 = hVar.c();
            long j3 = chatActivityEnterView.f32327y3;
            org.telegram.messenger.gj gjVar = chatActivityEnterView.B3;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.qm qmVar2 = chatActivityEnterView.D3;
            if (anVar != null) {
                fwVar = anVar.Y8();
            }
            org.telegram.messenger.ez.T(cVar, null, null, c10, null, "image/gif", j3, gjVar, threadMessage2, null, qmVar2, z10, ffVar, fwVar);
        } else {
            org.telegram.messenger.c cVar2 = chatActivityEnterView.S;
            Uri c11 = hVar.c();
            long j10 = chatActivityEnterView.f32327y3;
            org.telegram.messenger.gj gjVar2 = chatActivityEnterView.B3;
            threadMessage = chatActivityEnterView.getThreadMessage();
            if (anVar != null) {
                fwVar = anVar.Y8();
            }
            org.telegram.messenger.ez.Y(cVar2, c11, j10, gjVar2, threadMessage, ffVar, null, z10, 0, fwVar);
        }
        cg cgVar = chatActivityEnterView.H3;
        if (cgVar != null) {
            cgVar.M(null, true, i7, i10, 0L);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bg.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        return this.f33275f2.E4;
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.f33275f2;
        org.telegram.ui.an anVar = chatActivityEnterView.f32319x3;
        if (anVar != null) {
            anVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.q0(menu);
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f33275f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i7 = ChatActivityEnterView.N6;
            if (chatActivityEnterView.J2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.K6) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new s(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new s(this, 18));
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
            return onCreateInputConnection;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ChatActivityEnterView chatActivityEnterView = this.f33275f2;
        chatActivityEnterView.T = z10;
        super.onMeasure(i7, i10);
        if (chatActivityEnterView.T) {
            chatActivityEnterView.U = getLineCount();
            if (chatActivityEnterView.U > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatActivityEnterView.H1(z11);
            if (chatActivityEnterView.U <= 2 || TextUtils.isEmpty(getText().toString().trim())) {
                z12 = false;
            }
            chatActivityEnterView.N1(z12);
        }
        chatActivityEnterView.T = false;
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        cg cgVar = this.f33275f2.H3;
        if (cgVar != null) {
            cgVar.m0();
        }
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        boolean z10;
        m60 m60Var;
        xe xeVar;
        super.onSelectionChanged(i7, i10);
        ChatActivityEnterView chatActivityEnterView = this.f33275f2;
        cg cgVar = chatActivityEnterView.H3;
        if (cgVar != null) {
            cgVar.I();
        }
        wd wdVar = chatActivityEnterView.R0;
        if (wdVar != null) {
            if (chatActivityEnterView.f32319x3 != null && (xeVar = chatActivityEnterView.F0) != null && xeVar.getSelectionEnd() != chatActivityEnterView.F0.getSelectionStart()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (wdVar.f38299x != z10) {
                wdVar.f38299x = z10;
                wdVar.invalidate();
            }
            if (!z10 && (m60Var = chatActivityEnterView.t6) != null) {
                m60Var.u();
                chatActivityEnterView.t6 = null;
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.f33275f2;
            chatActivityEnterView.F2 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.J2 == null) {
                J(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f33275f2;
        if (!chatActivityEnterView.f32242m4 && chatActivityEnterView.f32223j4 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.E0()) {
                if (this.f33274e2 == null) {
                    kc kcVar = new kc(this);
                    this.f33274e2 = kcVar;
                    kcVar.h = new Runnable(this) {
                        public final bg f42351b;

                        {
                            this.f42351b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r2;
                            bg bgVar = this.f42351b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = bgVar.f33275f2;
                                    int i11 = ChatActivityEnterView.N6;
                                    chatActivityEnterView2.M1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = bgVar.f33275f2;
                                    chatActivityEnterView3.T3 = false;
                                    chatActivityEnterView3.X0();
                                    return;
                            }
                        }
                    };
                }
                kc kcVar2 = this.f33274e2;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                kcVar2.getClass();
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                kcVar2.f36378i = false;
                kcVar2.f36374c = 0;
                kcVar2.a(rectF);
                return this.f33274e2.b(motionEvent);
            } else if (chatActivityEnterView.G0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.f32333z2 != 0) {
                    chatActivityEnterView.D1(0, false);
                    chatActivityEnterView.V0.t(false);
                    requestFocus();
                }
                if (org.telegram.messenger.g0.D) {
                    i7 = 0;
                } else {
                    i7 = 2;
                }
                chatActivityEnterView.L1(i7, 0, true, true);
                if (chatActivityEnterView.f32210h4) {
                    chatActivityEnterView.E1(false, true, false, true);
                    chatActivityEnterView.T3 = true;
                    org.telegram.messenger.g0.i3(new Runnable(this) {
                        public final bg f42351b;

                        {
                            this.f42351b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r2;
                            bg bgVar = this.f42351b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = bgVar.f33275f2;
                                    int i11 = ChatActivityEnterView.N6;
                                    chatActivityEnterView2.M1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = bgVar.f33275f2;
                                    chatActivityEnterView3.T3 = false;
                                    chatActivityEnterView3.X0();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.X0();
                return true;
            } else {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i7, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.f33275f2;
        if (!chatActivityEnterView.A0 && !chatActivityEnterView.E0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i7, rect);
    }

    @Override
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = org.telegram.messenger.g0.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.f33275f2;
        if (chatActivityEnterView.U1.getForeground() != null) {
            st0 st0Var = chatActivityEnterView.U1;
            st0Var.invalidateDrawable(st0Var.getForeground());
        }
    }
}
