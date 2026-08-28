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
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public abstract class dg extends mt {
    public wc f27734c;
    public final ChatActivityEnterView d;

    public dg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.d = chatActivityEnterView;
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dg.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (qnVar != null) {
            qnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.g0(menu);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.b6 getResourcesProvider() {
        return this.d.R3;
    }

    public final void m(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.qn qnVar = this.d.K2;
        if (qnVar != null && qnVar.w()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.video.e(this, uri, AndroidUtilities.generatePicturePath(z10, MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 14));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (qnVar != null && qnVar.getParentActivity() != null) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
            if (chatActivityEnterView.f26189u2) {
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.runOnUIThread(new com.google.android.gms.common.api.internal.q1(this, arrayList, file, 12), 100L);
                return;
            }
            PhotoViewer.t1().K2(null, qnVar, chatActivityEnterView.R3);
            PhotoViewer.t1().f2(arrayList, 0, 2, false, new cg(this, photoEntry, file), chatActivityEnterView.K2);
        }
    }

    public final void o(t0.j jVar, boolean z10, int i9, int i10) {
        MessageObject threadMessage;
        int i11;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        cf cfVar = chatActivityEnterView.H0;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (cfVar != null) {
            cfVar.h(true);
            chatActivityEnterView.H0 = null;
        }
        org.telegram.ui.gn gnVar = chatActivityEnterView.Q2;
        if (gnVar != null && qnVar != null && gnVar.f38576f) {
            qnVar.Rb();
            return;
        }
        t0.i iVar = jVar.f47592a;
        if (iVar.j().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.N;
            Uri c10 = iVar.c();
            long j10 = chatActivityEnterView.L2;
            MessageObject messageObject = chatActivityEnterView.O2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.gn gnVar2 = chatActivityEnterView.Q2;
            if (qnVar != null) {
                sendMessageChatArguments = qnVar.C8();
            }
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, c10, null, "image/gif", j10, messageObject, threadMessage2, null, gnVar2, null, z10, 0, jVar, sendMessageChatArguments, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.N;
            Uri c11 = iVar.c();
            long j11 = chatActivityEnterView.L2;
            MessageObject messageObject2 = chatActivityEnterView.O2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.gn gnVar3 = chatActivityEnterView.Q2;
            if (qnVar == null) {
                i11 = 0;
            } else {
                i11 = qnVar.N3;
            }
            if (qnVar != null) {
                sendMessageChatArguments = qnVar.C8();
            }
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, c11, j11, messageObject2, threadMessage, gnVar3, null, null, null, jVar, 0, null, z10, 0, i11, sendMessageChatArguments);
        }
        eg egVar = chatActivityEnterView.U2;
        if (egVar != null) {
            egVar.y(null, true, i9, i10, 0L);
        }
    }

    @Override
    public final void onContextMenuClose() {
        eg egVar = this.d.U2;
        if (egVar != null) {
            egVar.J1();
        }
    }

    @Override
    public final void onContextMenuOpen() {
        eg egVar = this.d.U2;
        if (egVar != null) {
            egVar.e();
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i9 = ChatActivityEnterView.f26074i5;
            if (chatActivityEnterView.W1 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.f26119g5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.g.a(onCreateInputConnection, editorInfo, new s(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.g.a(onCreateInputConnection, editorInfo, new s(this, 18));
        } catch (Throwable th) {
            FileLog.e(th);
            return onCreateInputConnection;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ChatActivityEnterView chatActivityEnterView = this.d;
        chatActivityEnterView.O = z10;
        super.onMeasure(i9, i10);
        if (chatActivityEnterView.O) {
            chatActivityEnterView.P = getLineCount();
            if (chatActivityEnterView.P > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatActivityEnterView.p1(z11);
            chatActivityEnterView.v1((chatActivityEnterView.P <= 2 || TextUtils.isEmpty(getText().toString().trim())) ? false : false);
        }
        chatActivityEnterView.O = false;
    }

    @Override
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        eg egVar = this.d.U2;
        if (egVar != null) {
            egVar.Q();
        }
    }

    @Override
    public final void onSelectionChanged(int i9, int i10) {
        super.onSelectionChanged(i9, i10);
        eg egVar = this.d.U2;
        if (egVar != null) {
            egVar.p0(i9, i10);
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i9) {
        if (i9 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.S1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.W1 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i9);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i9;
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f26217z3 && chatActivityEnterView.f26200w3 == null) {
            if (!chatActivityEnterView.f26192v0 && !chatActivityEnterView.q0()) {
                if (this.f27734c == null) {
                    wc wcVar = new wc(this);
                    this.f27734c = wcVar;
                    wcVar.h = new Runnable(this) {
                        public final dg f27198b;

                        {
                            this.f27198b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r2;
                            dg dgVar = this.f27198b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = dgVar.d;
                                    int i11 = ChatActivityEnterView.f26074i5;
                                    chatActivityEnterView2.u1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = dgVar.d;
                                    chatActivityEnterView3.f26117g3 = false;
                                    chatActivityEnterView3.H0();
                                    return;
                            }
                        }
                    };
                }
                wc wcVar2 = this.f27734c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                wcVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = 0;
                rectF.set(f10, f10, measuredWidth, measuredHeight);
                wcVar2.f34193i = false;
                wcVar2.f34189c = 0;
                wcVar2.a(rectF);
                return this.f27734c.b(motionEvent);
            } else if (chatActivityEnterView.s0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.M1 != 0) {
                    chatActivityEnterView.m1(0, false);
                    chatActivityEnterView.Q0.t(false);
                    requestFocus();
                }
                if (AndroidUtilities.usingHardwareInput) {
                    i9 = 0;
                } else {
                    i9 = 2;
                }
                chatActivityEnterView.t1(i9, 0, true, true);
                if (chatActivityEnterView.f26190u3) {
                    chatActivityEnterView.n1(false, true, false, true);
                    chatActivityEnterView.f26117g3 = true;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final dg f27198b;

                        {
                            this.f27198b = this;
                        }

                        @Override
                        public final void run() {
                            int i10 = r2;
                            dg dgVar = this.f27198b;
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = dgVar.d;
                                    int i11 = ChatActivityEnterView.f26074i5;
                                    chatActivityEnterView2.u1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = dgVar.d;
                                    chatActivityEnterView3.f26117g3 = false;
                                    chatActivityEnterView3.H0();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.H0();
                return true;
            } else {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i9, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f26192v0 && !chatActivityEnterView.q0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i9, rect);
    }

    @Override
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = AndroidUtilities.dp(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override
    public void setOffsetY(float f10) {
        super.setOffsetY(f10);
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (chatActivityEnterView.f26121h1.getForeground() != null) {
            xu0 xu0Var = chatActivityEnterView.f26121h1;
            xu0Var.invalidateDrawable(xu0Var.getForeground());
        }
    }
}
