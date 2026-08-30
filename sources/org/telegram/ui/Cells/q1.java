package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
public final class q1 extends AccessibilityNodeProvider {
    public final Path f21564a = new Path();
    public final RectF f21565b = new RectF();
    public final Rect f21566c = new Rect();
    public final t1 d;

    public q1(t1 t1Var) {
        this.d = t1Var;
    }

    public final ClickableSpan a(int i10, boolean z4) {
        if (i10 == 5000) {
            return null;
        }
        t1 t1Var = this.d;
        if (z4) {
            int i11 = i10 - 3000;
            CharSequence charSequence = t1Var.f22273v7.caption;
            if (!(charSequence instanceof Spannable) || i11 < 0) {
                return null;
            }
            Spannable spannable = (Spannable) charSequence;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
            if (clickableSpanArr.length <= i11) {
                return null;
            }
            return clickableSpanArr[i11];
        }
        int i12 = i10 - 2000;
        CharSequence charSequence2 = t1Var.f22273v7.messageText;
        if (!(charSequence2 instanceof Spannable) || i12 < 0) {
            return null;
        }
        Spannable spannable2 = (Spannable) charSequence2;
        ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class);
        if (clickableSpanArr2.length <= i12) {
            return null;
        }
        return clickableSpanArr2[i12];
    }

    public final RichMessageLayout.RichBlock b(int i10, int[] iArr) {
        RichMessageLayout richMessageLayout;
        int i11;
        MessageObject messageObject = this.d.f22273v7;
        if (messageObject != null && (richMessageLayout = messageObject.richLayout) != null && i10 - 6000 >= 0) {
            int i12 = 0;
            for (int i13 = 0; i13 < richMessageLayout.blocks.size(); i13++) {
                RichMessageLayout.RichBlock richBlock = richMessageLayout.blocks.get(i13);
                if (richBlock.isVisible()) {
                    int accessibilityElementCount = richBlock.getAccessibilityElementCount() + i12;
                    if (i11 < accessibilityElementCount) {
                        iArr[0] = i11 - i12;
                        return richBlock;
                    }
                    i12 = accessibilityElementCount;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q1.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        k1 k1Var;
        i1 i1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        t1 t1Var = this.d;
        ArrayList arrayList = t1Var.V5;
        ArrayList arrayList2 = t1Var.f22132l7;
        if (i10 == -1) {
            t1Var.performAccessibilityAction(i11, bundle);
            return true;
        } else if (i11 == 64) {
            t1Var.I3(i10, 32768, null);
            return true;
        } else {
            boolean z4 = false;
            if (i11 == 16) {
                if (i10 == 5000) {
                    k1 k1Var2 = t1Var.Gc;
                    if (k1Var2 != null) {
                        k1Var2.y0(t1Var, t1Var.Vb, 0.0f, 0.0f);
                        return true;
                    }
                } else if (i10 >= 6000) {
                    int[] iArr = {0};
                    RichMessageLayout.RichBlock b10 = b(i10, iArr);
                    if (b10 != null && b10.onAccessibilityElementClick(iArr[0], t1Var)) {
                        t1Var.I3(i10, 1, null);
                        AndroidUtilities.makeAccessibilityAnnouncement(b10.getAccessibilityElementStateDescription(iArr[0]));
                        return true;
                    }
                } else if (i10 >= 3000) {
                    ClickableSpan a2 = a(i10, true);
                    if (a2 != null) {
                        t1Var.Gc.W0(t1Var, a2, false);
                        t1Var.I3(i10, 1, null);
                        return true;
                    }
                } else if (i10 >= 2000) {
                    ClickableSpan a10 = a(i10, false);
                    if (a10 != null) {
                        t1Var.Gc.W0(t1Var, a10, false);
                        t1Var.I3(i10, 1, null);
                        return true;
                    }
                } else {
                    if (i10 >= 1000) {
                        int i12 = i10 - 1000;
                        if (i12 < arrayList2.size()) {
                            e0 e0Var = (e0) arrayList2.get(i12);
                            k1 k1Var3 = t1Var.Gc;
                            if (k1Var3 != null && !e0Var.f20971m) {
                                BotInlineKeyboard.ButtonCustom buttonCustom = e0Var.f20968j;
                                if (buttonCustom != null) {
                                    k1Var3.E(t1Var, buttonCustom);
                                } else {
                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = e0Var.f20967i;
                                    if (keyboardInlineButton != null) {
                                        k1Var3.o1(t1Var, keyboardInlineButton);
                                    }
                                }
                            }
                            t1Var.I3(i10, 1, null);
                            return true;
                        }
                    } else if (i10 >= 500) {
                        int i13 = i10 - 500;
                        if (i13 < arrayList.size()) {
                            r1 r1Var = (r1) arrayList.get(i13);
                            if (t1Var.Gc != null) {
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(r1Var.f21613s);
                                t1Var.Gc.i(t1Var, arrayList3, -1, 0, 0);
                            }
                            t1Var.I3(i10, 1, null);
                            return true;
                        }
                    } else if (i10 == 495) {
                        t1Var.x1();
                        return true;
                    } else if (i10 == 499) {
                        k1 k1Var4 = t1Var.Gc;
                        if (k1Var4 != null) {
                            k1Var4.R0(t1Var.Y2, t1Var);
                            return true;
                        }
                    } else if (i10 == 492) {
                        k1 k1Var5 = t1Var.Gc;
                        if (k1Var5 != null) {
                            k1Var5.R0(5, t1Var);
                            return true;
                        }
                    } else if (i10 == 491) {
                        k1 k1Var6 = t1Var.Gc;
                        if (k1Var6 != null) {
                            k1Var6.R0(5, t1Var);
                            return true;
                        }
                    } else if (i10 == 490) {
                        k1 k1Var7 = t1Var.Gc;
                        if (k1Var7 != null) {
                            k1Var7.R0(31, t1Var);
                            return true;
                        }
                    } else if (i10 == 489) {
                        k1 k1Var8 = t1Var.Gc;
                        if (k1Var8 != null) {
                            k1Var8.R0(30, t1Var);
                            return true;
                        }
                    } else if (i10 == 498) {
                        k1 k1Var9 = t1Var.Gc;
                        if (k1Var9 != null) {
                            k1Var9.q(t1Var);
                            return true;
                        }
                    } else if (i10 == 497) {
                        if (t1Var.Gc != null && ((!t1Var.T7 || t1Var.R7 || t1Var.f22273v7.getReplyTopMsgId() != 0) && (t1Var.f22273v7.hasValidReplyMessageObject() || t1Var.f22275v9 || ((message = t1Var.f22273v7.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null)))) {
                            t1Var.Gc.e2(t1Var, t1Var.f22273v7.getReplyMsgId(), 0.0f, 0.0f, false);
                            return true;
                        }
                    } else if (i10 == 494) {
                        k1 k1Var10 = t1Var.Gc;
                        if (k1Var10 != null) {
                            TLRPC.Chat chat = t1Var.f22066gc;
                            if (chat != null) {
                                k1Var10.T(t1Var, chat, t1Var.f22273v7.messageOwner.fwd_from.channel_post, t1Var.f22011d1, t1Var.f22026e1, false);
                                return true;
                            }
                            TLRPC.User user = t1Var.f22036ec;
                            if (user != null) {
                                k1Var10.y0(t1Var, user, t1Var.f22011d1, t1Var.f22026e1);
                                return true;
                            } else if (t1Var.f22080hc != null) {
                                k1Var10.n(t1Var);
                                return true;
                            }
                        }
                    } else if (i10 == 496) {
                        k1 k1Var11 = t1Var.Gc;
                        if (k1Var11 != null) {
                            if (t1Var.Z7) {
                                k1Var11.q(t1Var);
                                return true;
                            }
                            k1Var11.u(t1Var);
                            return true;
                        }
                    } else if (i10 == 493 && (i1Var = t1Var.J5) != null) {
                        i1Var.m();
                        return true;
                    }
                    return false;
                }
            } else if (i11 == 32) {
                if (i10 >= 3000) {
                    z4 = true;
                }
                ClickableSpan a11 = a(i10, z4);
                if (a11 != null && (k1Var = t1Var.Gc) != null) {
                    k1Var.W0(t1Var, a11, true);
                    t1Var.I3(i10, 2, null);
                }
            }
            return true;
        }
    }
}
