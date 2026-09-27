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
public abstract class ng extends du {
    public fd f26813c;
    public final ChatActivityEnterView d;

    public ng(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.d = chatActivityEnterView;
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ng.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.xn xnVar = chatActivityEnterView.P2;
        if (xnVar != null) {
            xnVar.extendActionMode(menu);
        } else {
            chatActivityEnterView.h0(menu);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        return this.d.W3;
    }

    public final void m(Uri uri, String str) {
        boolean z10;
        org.telegram.ui.xn xnVar = this.d.P2;
        if (xnVar != null && xnVar.v()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.video.o(this, uri, AndroidUtilities.generatePicturePath(z10, MimeTypeMap.getSingleton().getExtensionFromMimeType(str)), 12));
    }

    public final void n(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.xn xnVar = chatActivityEnterView.P2;
        if (xnVar != null && xnVar.getParentActivity() != null) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(0);
            if (chatActivityEnterView.f22100z2) {
                AndroidUtilities.hideKeyboard(this);
                AndroidUtilities.runOnUIThread(new c5.v(this, arrayList, file, false, 9), 100L);
                return;
            }
            PhotoViewer.t1().J2(null, xnVar, chatActivityEnterView.W3);
            PhotoViewer.t1().f2(arrayList, 0, 2, false, new mg(this, photoEntry, file), chatActivityEnterView.P2);
        }
    }

    public final void o(t0.i iVar, boolean z10, int i10, int i11) {
        MessageObject threadMessage;
        int i12;
        MessageObject threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.d;
        org.telegram.ui.xn xnVar = chatActivityEnterView.P2;
        nf nfVar = chatActivityEnterView.L0;
        SendMessageChatArguments sendMessageChatArguments = null;
        if (nfVar != null) {
            nfVar.h(true);
            chatActivityEnterView.L0 = null;
        }
        org.telegram.ui.nn nnVar = chatActivityEnterView.V2;
        if (nnVar != null && xnVar != null && nnVar.f36054f) {
            xnVar.Rb();
            return;
        }
        t0.h hVar = iVar.f43333a;
        if (hVar.getDescription().hasMimeType("image/gif")) {
            AccountInstance accountInstance = chatActivityEnterView.R;
            Uri c10 = hVar.c();
            long j3 = chatActivityEnterView.Q2;
            MessageObject messageObject = chatActivityEnterView.T2;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.nn nnVar2 = chatActivityEnterView.V2;
            if (xnVar != null) {
                sendMessageChatArguments = xnVar.C8();
            }
            SendMessagesHelper.prepareSendingDocument(accountInstance, null, null, c10, null, "image/gif", j3, messageObject, threadMessage2, null, nnVar2, null, z10, 0, iVar, sendMessageChatArguments, false);
        } else {
            AccountInstance accountInstance2 = chatActivityEnterView.R;
            Uri c11 = hVar.c();
            long j10 = chatActivityEnterView.Q2;
            MessageObject messageObject2 = chatActivityEnterView.T2;
            threadMessage = chatActivityEnterView.getThreadMessage();
            org.telegram.ui.nn nnVar3 = chatActivityEnterView.V2;
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
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.H(null, true, i10, i11, 0L);
        }
    }

    @Override
    public final void onContextMenuClose() {
        og ogVar = this.d.Z2;
        if (ogVar != null) {
            ogVar.d2();
        }
    }

    @Override
    public final void onContextMenuOpen() {
        og ogVar = this.d.Z2;
        if (ogVar != null) {
            ogVar.l();
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
            int i10 = ChatActivityEnterView.f21955n5;
            if (chatActivityEnterView.f21965b2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !chatActivityEnterView.f22027l5) {
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
            chatActivityEnterView.o1(z11);
            chatActivityEnterView.u1((chatActivityEnterView.T <= 2 || TextUtils.isEmpty(getText().toString().trim())) ? false : false);
        }
        chatActivityEnterView.S = false;
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        og ogVar = this.d.Z2;
        if (ogVar != null) {
            ogVar.m0();
        }
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        og ogVar = this.d.Z2;
        if (ogVar != null) {
            ogVar.E0(i10, i11);
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.d;
            chatActivityEnterView.X1 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.f21965b2 == null) {
                m(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.E3 && chatActivityEnterView.B3 == null) {
            if (!chatActivityEnterView.f22098z0 && !chatActivityEnterView.r0()) {
                if (this.f26813c == null) {
                    fd fdVar = new fd(this);
                    this.f26813c = fdVar;
                    fdVar.h = new Runnable(this) {
                        public final ng f26044b;

                        {
                            this.f26044b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            ng ngVar = this.f26044b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = ngVar.d;
                                    int i12 = ChatActivityEnterView.f21955n5;
                                    chatActivityEnterView2.t1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = ngVar.d;
                                    chatActivityEnterView3.f22026l3 = false;
                                    chatActivityEnterView3.I0();
                                    return;
                            }
                        }
                    };
                }
                fd fdVar2 = this.f26813c;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                fdVar2.getClass();
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = 0;
                rectF.set(f7, f7, measuredWidth, measuredHeight);
                fdVar2.f24265i = false;
                fdVar2.f24262c = 0;
                fdVar2.a(rectF);
                return this.f26813c.b(motionEvent);
            } else if (chatActivityEnterView.t0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.l1(0, false);
                    chatActivityEnterView.U0.t(false);
                    requestFocus();
                }
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                chatActivityEnterView.s1(i10, 0, true, true);
                if (chatActivityEnterView.f22101z3) {
                    chatActivityEnterView.m1(false, true, false, true);
                    chatActivityEnterView.f22026l3 = true;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final ng f26044b;

                        {
                            this.f26044b = this;
                        }

                        @Override
                        public final void run() {
                            int i11 = r2;
                            ng ngVar = this.f26044b;
                            switch (i11) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = ngVar.d;
                                    int i12 = ChatActivityEnterView.f21955n5;
                                    chatActivityEnterView2.t1();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = ngVar.d;
                                    chatActivityEnterView3.f22026l3 = false;
                                    chatActivityEnterView3.I0();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.I0();
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
        if (!chatActivityEnterView.f22098z0 && !chatActivityEnterView.r0()) {
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
        if (chatActivityEnterView.f22028m1.getForeground() != null) {
            cw0 cw0Var = chatActivityEnterView.f22028m1;
            cw0Var.invalidateDrawable(cw0Var.getForeground());
        }
    }
}
