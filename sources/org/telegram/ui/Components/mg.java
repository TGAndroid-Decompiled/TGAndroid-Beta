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
public abstract class mg extends cu {
    public fd f26170c;
    public final ChatActivityEnterView d;

    public mg(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.d = chatActivityEnterView;
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mg.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
        if (xnVar != null) {
            xnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.i0(menu);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        return this.d.V3;
    }

    public final void m(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.xn xnVar = this.d.O2;
        if (xnVar != null && xnVar.v()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.ActionBar.p(this, uri, AndroidUtilities.generatePicturePath(z10, MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 9));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
        if (xnVar != null && xnVar.getParentActivity() != null) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
            if (chatActivityEnterView.f21842y2) {
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.runOnUIThread(new c5.v(this, arrayList, file, false, 9), 100L);
                return;
            }
            PhotoViewer.t1().J2(null, xnVar, chatActivityEnterView.V3);
            PhotoViewer.t1().f2(arrayList, 0, 2, false, new lg(this, photoEntry, file), chatActivityEnterView.O2);
        }
    }

    public final void o(t0.i iVar, boolean z10, int i10, int i11) {
        MessageObject threadMessage;
        int i12;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
        mf mfVar = chatActivityEnterView.L0;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (mfVar != null) {
            mfVar.h(true);
            chatActivityEnterView.L0 = null;
        }
        org.telegram.ui.nn nnVar = chatActivityEnterView.U2;
        if (nnVar != null && xnVar != null && nnVar.f35560f) {
            xnVar.Rb();
            return;
        }
        t0.h hVar = iVar.f42952a;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.R;
            Uri c10 = hVar.c();
            long j3 = chatActivityEnterView.P2;
            MessageObject messageObject = chatActivityEnterView.S2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.nn nnVar2 = chatActivityEnterView.U2;
            if (xnVar != null) {
                sendMessageChatArguments = xnVar.C8();
            }
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, c10, null, "image/gif", j3, messageObject, threadMessage2, null, nnVar2, null, z10, 0, iVar, sendMessageChatArguments, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.R;
            Uri c11 = hVar.c();
            long j10 = chatActivityEnterView.P2;
            MessageObject messageObject2 = chatActivityEnterView.S2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.nn nnVar3 = chatActivityEnterView.U2;
            if (xnVar == null) {
                i12 = 0;
            } else {
                i12 = xnVar.R3;
            }
            if (xnVar != null) {
                sendMessageChatArguments = xnVar.C8();
            }
            SendMessagesHelper.prepareSendingPhoto(accountInstance2, null, c11, j10, messageObject2, threadMessage, nnVar3, null, null, null, iVar, 0, null, z10, 0, i12, sendMessageChatArguments);
        }
        ng ngVar = chatActivityEnterView.Y2;
        if (ngVar != null) {
            ngVar.H(null, true, i10, i11, 0L);
        }
    }

    @Override
    public final void onContextMenuClose() {
        ng ngVar = this.d.Y2;
        if (ngVar != null) {
            ngVar.d2();
        }
    }

    @Override
    public final void onContextMenuOpen() {
        ng ngVar = this.d.Y2;
        if (ngVar != null) {
            ngVar.l();
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
            int i10 = ChatActivityEnterView.f21701n5;
            if (chatActivityEnterView.a2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.f21773l5) {
                t0.b.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
                return t0.f.a(onCreateInputConnection, editorInfo, new s(this, 18));
            }
            t0.b.b(editorInfo, null);
            return t0.f.a(onCreateInputConnection, editorInfo, new s(this, 18));
        } catch (Throwable th2) {
            FileLog.e(th2);
            return onCreateInputConnection;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ChatActivityEnterView chatActivityEnterView = this.d;
        chatActivityEnterView.S = z10;
        super.onMeasure(i10, i11);
        if (chatActivityEnterView.S) {
            chatActivityEnterView.T = getLineCount();
            if (chatActivityEnterView.T > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatActivityEnterView.q1(z11);
            chatActivityEnterView.w1((chatActivityEnterView.T <= 2 || TextUtils.isEmpty(getText().toString().trim())) ? false : false);
        }
        chatActivityEnterView.S = false;
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        ng ngVar = this.d.Y2;
        if (ngVar != null) {
            ngVar.m0();
        }
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        ng ngVar = this.d.Y2;
        if (ngVar != null) {
            ngVar.E0(i10, i11);
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.W1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.a2 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.D3 && chatActivityEnterView.A3 == null) {
            if (!chatActivityEnterView.f21844z0 && !chatActivityEnterView.s0()) {
                if (this.f26170c == null) {
                    fd fdVar = new fd(this);
                    this.f26170c = fdVar;
                    fdVar.h = new Runnable(this) {
                        public final mg f25597b;

                        {
                            this.f25597b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            mg mgVar = this.f25597b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = mgVar.d;
                                    int i12 = ChatActivityEnterView.f21701n5;
                                    chatActivityEnterView2.v1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = mgVar.d;
                                    chatActivityEnterView3.f21767k3 = false;
                                    chatActivityEnterView3.J0();
                                    return;
                            }
                        }
                    };
                }
                fd fdVar2 = this.f26170c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                fdVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = 0;
                rectF.set(f7, f7, measuredWidth, measuredHeight);
                fdVar2.f23945i = false;
                fdVar2.f23942c = 0;
                fdVar2.a(rectF);
                return this.f26170c.b(motionEvent);
            } else if (chatActivityEnterView.u0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.Q1 != 0) {
                    chatActivityEnterView.n1(0, false);
                    chatActivityEnterView.U0.t(false);
                    requestFocus();
                }
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                chatActivityEnterView.u1(i10, 0, true, true);
                if (chatActivityEnterView.y3) {
                    chatActivityEnterView.o1(false, true, false, true);
                    chatActivityEnterView.f21767k3 = true;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final mg f25597b;

                        {
                            this.f25597b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            mg mgVar = this.f25597b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = mgVar.d;
                                    int i12 = ChatActivityEnterView.f21701n5;
                                    chatActivityEnterView2.v1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = mgVar.d;
                                    chatActivityEnterView3.f21767k3 = false;
                                    chatActivityEnterView3.J0();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.J0();
                return true;
            } else {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i10, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.f21844z0 && !chatActivityEnterView.s0()) {
            return false;
        }
        chatActivityEnterView.getClass();
        return super.requestFocus(i10, rect);
    }

    @Override
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = AndroidUtilities.dp(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override
    public void setOffsetY(float f7) {
        super.setOffsetY(f7);
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (chatActivityEnterView.l1.getForeground() != null) {
            pv0 pv0Var = chatActivityEnterView.l1;
            pv0Var.invalidateDrawable(pv0Var.getForeground());
        }
    }
}
