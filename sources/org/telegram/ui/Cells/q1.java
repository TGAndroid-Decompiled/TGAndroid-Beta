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
    public final Path f24891a = new Path();
    public final RectF f24892b = new RectF();
    public final Rect f24893c = new Rect();
    public final t1 d;

    public q1(t1 t1Var) {
        this.d = t1Var;
    }

    public final ClickableSpan a(int i9, boolean z10) {
        if (i9 == 5000) {
            return null;
        }
        t1 t1Var = this.d;
        if (z10) {
            int i10 = i9 - 3000;
            CharSequence charSequence = t1Var.f25593u7.caption;
            if (!(charSequence instanceof Spannable) || i10 < 0) {
                return null;
            }
            Spannable spannable = (Spannable) charSequence;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
            if (clickableSpanArr.length <= i10) {
                return null;
            }
            return clickableSpanArr[i10];
        }
        int i11 = i9 - 2000;
        CharSequence charSequence2 = t1Var.f25593u7.messageText;
        if (!(charSequence2 instanceof Spannable) || i11 < 0) {
            return null;
        }
        Spannable spannable2 = (Spannable) charSequence2;
        ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class);
        if (clickableSpanArr2.length <= i11) {
            return null;
        }
        return clickableSpanArr2[i11];
    }

    public final RichMessageLayout.RichBlock b(int i9, int[] iArr) {
        RichMessageLayout richMessageLayout;
        int i10;
        MessageObject messageObject = this.d.f25593u7;
        if (messageObject != null && (richMessageLayout = messageObject.richLayout) != null && i9 - 6000 >= 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < richMessageLayout.blocks.size(); i12++) {
                RichMessageLayout.RichBlock richBlock = richMessageLayout.blocks.get(i12);
                if (richBlock.isVisible()) {
                    int accessibilityElementCount = richBlock.getAccessibilityElementCount() + i11;
                    if (i10 < accessibilityElementCount) {
                        iArr[0] = i10 - i11;
                        return richBlock;
                    }
                    i11 = accessibilityElementCount;
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
    public final boolean performAction(int i9, int i10, Bundle bundle) {
        k1 k1Var;
        i1 i1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        t1 t1Var = this.d;
        ArrayList arrayList = t1Var.U5;
        ArrayList arrayList2 = t1Var.f25451k7;
        if (i9 == -1) {
            t1Var.performAccessibilityAction(i10, bundle);
            return true;
        } else if (i10 == 64) {
            t1Var.I3(i9, 32768, null);
            return true;
        } else {
            boolean z10 = false;
            if (i10 == 16) {
                if (i9 == 5000) {
                    k1 k1Var2 = t1Var.Fc;
                    if (k1Var2 != null) {
                        k1Var2.u0(t1Var, t1Var.Ub, 0.0f, 0.0f);
                        return true;
                    }
                } else if (i9 >= 6000) {
                    int[] iArr = {0};
                    RichMessageLayout.RichBlock b10 = b(i9, iArr);
                    if (b10 != null && b10.onAccessibilityElementClick(iArr[0], t1Var)) {
                        t1Var.I3(i9, 1, null);
                        AndroidUtilities.makeAccessibilityAnnouncement(b10.getAccessibilityElementStateDescription(iArr[0]));
                        return true;
                    }
                } else if (i9 >= 3000) {
                    ClickableSpan a2 = a(i9, true);
                    if (a2 != null) {
                        t1Var.Fc.R0(t1Var, a2, false);
                        t1Var.I3(i9, 1, null);
                        return true;
                    }
                } else if (i9 >= 2000) {
                    ClickableSpan a3 = a(i9, false);
                    if (a3 != null) {
                        t1Var.Fc.R0(t1Var, a3, false);
                        t1Var.I3(i9, 1, null);
                        return true;
                    }
                } else {
                    if (i9 >= 1000) {
                        int i11 = i9 - 1000;
                        if (i11 < arrayList2.size()) {
                            e0 e0Var = (e0) arrayList2.get(i11);
                            k1 k1Var3 = t1Var.Fc;
                            if (k1Var3 != null && !e0Var.f24259m) {
                                BotInlineKeyboard.ButtonCustom buttonCustom = e0Var.f24256j;
                                if (buttonCustom != null) {
                                    k1Var3.M(t1Var, buttonCustom);
                                } else {
                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = e0Var.f24255i;
                                    if (keyboardInlineButton != null) {
                                        k1Var3.e1(t1Var, keyboardInlineButton);
                                    }
                                }
                            }
                            t1Var.I3(i9, 1, null);
                            return true;
                        }
                    } else if (i9 >= 500) {
                        int i12 = i9 - 500;
                        if (i12 < arrayList.size()) {
                            r1 r1Var = (r1) arrayList.get(i12);
                            if (t1Var.Fc != null) {
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(r1Var.f24947s);
                                t1Var.Fc.l(t1Var, arrayList3, -1, 0, 0);
                            }
                            t1Var.I3(i9, 1, null);
                            return true;
                        }
                    } else if (i9 == 495) {
                        t1Var.x1();
                        return true;
                    } else if (i9 == 499) {
                        k1 k1Var4 = t1Var.Fc;
                        if (k1Var4 != null) {
                            k1Var4.O0(t1Var.X2, t1Var);
                            return true;
                        }
                    } else if (i9 == 492) {
                        k1 k1Var5 = t1Var.Fc;
                        if (k1Var5 != null) {
                            k1Var5.O0(5, t1Var);
                            return true;
                        }
                    } else if (i9 == 491) {
                        k1 k1Var6 = t1Var.Fc;
                        if (k1Var6 != null) {
                            k1Var6.O0(5, t1Var);
                            return true;
                        }
                    } else if (i9 == 490) {
                        k1 k1Var7 = t1Var.Fc;
                        if (k1Var7 != null) {
                            k1Var7.O0(31, t1Var);
                            return true;
                        }
                    } else if (i9 == 489) {
                        k1 k1Var8 = t1Var.Fc;
                        if (k1Var8 != null) {
                            k1Var8.O0(30, t1Var);
                            return true;
                        }
                    } else if (i9 == 498) {
                        k1 k1Var9 = t1Var.Fc;
                        if (k1Var9 != null) {
                            k1Var9.v(t1Var);
                            return true;
                        }
                    } else if (i9 == 497) {
                        if (t1Var.Fc != null && ((!t1Var.S7 || t1Var.Q7 || t1Var.f25593u7.getReplyTopMsgId() != 0) && (t1Var.f25593u7.hasValidReplyMessageObject() || t1Var.f25595u9 || ((message = t1Var.f25593u7.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null)))) {
                            t1Var.Fc.S1(t1Var, t1Var.f25593u7.getReplyMsgId(), 0.0f, 0.0f, false);
                            return true;
                        }
                    } else if (i9 == 494) {
                        k1 k1Var10 = t1Var.Fc;
                        if (k1Var10 != null) {
                            TLRPC.Chat chat = t1Var.fc;
                            if (chat != null) {
                                k1Var10.Z(t1Var, chat, t1Var.f25593u7.messageOwner.fwd_from.channel_post, t1Var.f25329c1, t1Var.f25344d1, false);
                                return true;
                            }
                            TLRPC.User user = t1Var.f25354dc;
                            if (user != null) {
                                k1Var10.u0(t1Var, user, t1Var.f25329c1, t1Var.f25344d1);
                                return true;
                            } else if (t1Var.f25398gc != null) {
                                k1Var10.r(t1Var);
                                return true;
                            }
                        }
                    } else if (i9 == 496) {
                        k1 k1Var11 = t1Var.Fc;
                        if (k1Var11 != null) {
                            if (t1Var.Y7) {
                                k1Var11.v(t1Var);
                                return true;
                            }
                            k1Var11.z(t1Var);
                            return true;
                        }
                    } else if (i9 == 493 && (i1Var = t1Var.I5) != null) {
                        i1Var.m();
                        return true;
                    }
                    return false;
                }
            } else if (i10 == 32) {
                if (i9 >= 3000) {
                    z10 = true;
                }
                ClickableSpan a10 = a(i9, z10);
                if (a10 != null && (k1Var = t1Var.Fc) != null) {
                    k1Var.R0(t1Var, a10, true);
                    t1Var.I3(i9, 2, null);
                }
            }
            return true;
        }
    }
}
