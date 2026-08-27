package org.telegram.ui.Cells;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.RadialProgress2;

public final class p1 extends AccessibilityNodeProvider {

    public final Path f24834a = new Path();

    public final RectF f24835b = new RectF();

    public final Rect f24836c = new Rect();
    public final s1 d;

    public p1(s1 s1Var) {
        this.d = s1Var;
    }

    public final ClickableSpan a(int i10, boolean z10) {
        if (i10 == 5000) {
            return null;
        }
        s1 s1Var = this.d;
        if (z10) {
            int i11 = i10 - 3000;
            CharSequence charSequence = s1Var.f25546u7.caption;
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
        CharSequence charSequence2 = s1Var.f25546u7.messageText;
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
        MessageObject messageObject = this.d.f25546u7;
        if (messageObject == null || (richMessageLayout = messageObject.richLayout) == null || (i11 = i10 - 6000) < 0) {
            return null;
        }
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

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        boolean z10;
        String str;
        int i11;
        String shortNumber;
        String str2;
        int i12;
        boolean z11;
        boolean z12;
        String str3;
        int i13;
        int i14;
        boolean zIsUserSelf;
        TLRPC.MessagePeerReaction messagePeerReaction;
        String str4;
        int i15;
        String string;
        AccessibilityNodeInfo accessibilityNodeInfo;
        String string2;
        RectF rectF;
        int[] iArr = {0, 0};
        s1 s1Var = this.d;
        RectF rectF2 = s1Var.f25542u3;
        ArrayList arrayList = s1Var.U5;
        ArrayList arrayList2 = s1Var.f25405k7;
        s1Var.getLocationOnScreen(iArr);
        if (i10 != -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            accessibilityNodeInfoObtain.setSource(s1Var, i10);
            accessibilityNodeInfoObtain.setParent(s1Var);
            accessibilityNodeInfoObtain.setPackageName(s1Var.getContext().getPackageName());
            Rect rect = this.f24836c;
            if (i10 == 5000) {
                if (s1Var.Ub != null) {
                    accessibilityNodeInfoObtain.setText(UserObject.getUserName(s1Var.Ub));
                    float f10 = s1Var.Sa;
                    int i16 = (int) f10;
                    int i17 = (int) s1Var.Ta;
                    int i18 = (int) (f10 + s1Var.Qa);
                    float f11 = s1Var.Ta;
                    StaticLayout staticLayout = s1Var.Ga;
                    rect.set(i16, i17, i18, (int) (f11 + (staticLayout != null ? staticLayout.getHeight() : 10)));
                    accessibilityNodeInfoObtain.setBoundsInParent(rect);
                    if (s1Var.f25423ld.get(i10) == null) {
                        s1Var.f25423ld.put(i10, new Rect(rect));
                    }
                    rect.offset(iArr[0], iArr[1]);
                    accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                    accessibilityNodeInfoObtain.setClassName("android.widget.TextView");
                    accessibilityNodeInfoObtain.setEnabled(true);
                    accessibilityNodeInfoObtain.setClickable(true);
                    accessibilityNodeInfoObtain.setLongClickable(true);
                    accessibilityNodeInfoObtain.addAction(16);
                    accessibilityNodeInfoObtain.addAction(32);
                    z10 = true;
                }
                return null;
            }
            if (i10 >= 6000) {
                int[] iArr2 = {0};
                RichMessageLayout.RichBlock richBlockB = b(i10, iArr2);
                if (richBlockB != null) {
                    accessibilityNodeInfoObtain.setText(richBlockB.getAccessibilityElementText(iArr2[0]));
                    richBlockB.getAccessibilityElementBounds(iArr2[0], rect);
                    rect.offset(s1Var.f25383j0, s1Var.f25440n0);
                    accessibilityNodeInfoObtain.setBoundsInParent(rect);
                    if (s1Var.f25423ld.get(i10) == null) {
                        s1Var.f25423ld.put(i10, new Rect(rect));
                    }
                    rect.offset(iArr[0], iArr[1]);
                    accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                    boolean zIsAccessibilityElementCheckbox = richBlockB.isAccessibilityElementCheckbox(iArr2[0]);
                    if (zIsAccessibilityElementCheckbox) {
                        accessibilityNodeInfoObtain.setClassName("android.widget.CheckBox");
                    } else if (richBlockB.isAccessibilityElementText(iArr2[0])) {
                        accessibilityNodeInfoObtain.setClassName("android.widget.TextView");
                    } else {
                        accessibilityNodeInfoObtain.setClassName("android.widget.ImageView");
                    }
                    accessibilityNodeInfoObtain.setEnabled(true);
                    if (zIsAccessibilityElementCheckbox) {
                        accessibilityNodeInfoObtain.setCheckable(true);
                        accessibilityNodeInfoObtain.setChecked(richBlockB.isAccessibilityElementChecked(iArr2[0]));
                    }
                    boolean zIsAccessibilityElementClickable = richBlockB.isAccessibilityElementClickable(iArr2[0]);
                    accessibilityNodeInfoObtain.setClickable(zIsAccessibilityElementClickable);
                    if (zIsAccessibilityElementClickable) {
                        accessibilityNodeInfoObtain.addAction(16);
                    }
                    z10 = true;
                }
                return null;
            }
            RectF rectF3 = this.f24835b;
            Path path = this.f24834a;
            if (i10 >= 3000) {
                if ((s1Var.f25546u7.caption instanceof Spannable) && s1Var.Y3 != null) {
                    Spannable spannable = (Spannable) s1Var.f25546u7.caption;
                    ClickableSpan clickableSpanA = a(i10, false);
                    if (clickableSpanA != null) {
                        int[] iArrI2 = s1.I2(spannable, clickableSpanA);
                        accessibilityNodeInfoObtain.setText(spannable.subSequence(iArrI2[0], iArrI2[1]).toString());
                        ArrayList<MessageObject.TextLayoutBlock> arrayList3 = s1Var.Y3.textLayoutBlocks;
                        int size = arrayList3.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size) {
                                z12 = true;
                                break;
                            }
                            MessageObject.TextLayoutBlock textLayoutBlock = arrayList3.get(i19);
                            i19++;
                            MessageObject.TextLayoutBlock textLayoutBlock2 = textLayoutBlock;
                            int length = textLayoutBlock2.textLayout.getText().length();
                            int i20 = textLayoutBlock2.charactersOffset;
                            int[] iArr3 = iArr;
                            int i21 = iArrI2[0];
                            if (i20 <= i21) {
                                int i22 = length + i20;
                                int i23 = iArrI2[1];
                                if (i22 >= i23) {
                                    textLayoutBlock2.textLayout.getSelectionPath(i21 - i20, i23 - i20, path);
                                    path.computeBounds(rectF3, true);
                                    rect.set((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                    rect.offset(0, (int) textLayoutBlock2.textYOffset(s1Var.Y3.textLayoutBlocks, s1Var.Vc));
                                    rect.offset(s1Var.f25383j0, s1Var.f25440n0);
                                    accessibilityNodeInfoObtain.setBoundsInParent(rect);
                                    if (s1Var.f25423ld.get(i10) == null) {
                                        s1Var.f25423ld.put(i10, new Rect(rect));
                                    }
                                    z12 = true;
                                    rect.offset(iArr3[0], iArr3[1]);
                                    accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                                    break;
                                }
                            }
                            iArr = iArr3;
                        }
                        accessibilityNodeInfoObtain.setClassName("android.widget.TextView");
                        accessibilityNodeInfoObtain.setEnabled(z12);
                        accessibilityNodeInfoObtain.setClickable(z12);
                        accessibilityNodeInfoObtain.setLongClickable(z12);
                        accessibilityNodeInfoObtain.addAction(16);
                        accessibilityNodeInfoObtain.addAction(32);
                        z10 = true;
                    }
                }
                return null;
            }
            if (i10 >= 2000) {
                if (s1Var.f25546u7.messageText instanceof Spannable) {
                    Spannable spannable2 = (Spannable) s1Var.f25546u7.messageText;
                    ClickableSpan clickableSpanA2 = a(i10, false);
                    if (clickableSpanA2 != null) {
                        int[] iArrI3 = s1.I2(spannable2, clickableSpanA2);
                        accessibilityNodeInfoObtain.setText(spannable2.subSequence(iArrI3[0], iArrI3[1]).toString());
                        ArrayList<MessageObject.TextLayoutBlock> arrayList4 = s1Var.f25546u7.textLayoutBlocks;
                        int size2 = arrayList4.size();
                        int i24 = 0;
                        while (true) {
                            if (i24 >= size2) {
                                z11 = true;
                                break;
                            }
                            MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList4.get(i24);
                            i24++;
                            MessageObject.TextLayoutBlock textLayoutBlock4 = textLayoutBlock3;
                            int length2 = textLayoutBlock4.textLayout.getText().length();
                            int i25 = textLayoutBlock4.charactersOffset;
                            int i26 = iArrI3[0];
                            if (i25 <= i26) {
                                int i27 = length2 + i25;
                                int i28 = iArrI3[1];
                                if (i27 >= i28) {
                                    textLayoutBlock4.textLayout.getSelectionPath(i26 - i25, i28 - i25, path);
                                    path.computeBounds(rectF3, true);
                                    rect.set((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                                    rect.offset(0, (int) textLayoutBlock4.textYOffset(s1Var.f25546u7.textLayoutBlocks, s1Var.Vc));
                                    rect.offset(s1Var.f25383j0, s1Var.f25440n0);
                                    accessibilityNodeInfoObtain.setBoundsInParent(rect);
                                    if (s1Var.f25423ld.get(i10) == null) {
                                        s1Var.f25423ld.put(i10, new Rect(rect));
                                    }
                                    z11 = true;
                                    rect.offset(iArr[0], iArr[1]);
                                    accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                                    break;
                                }
                            }
                        }
                        accessibilityNodeInfoObtain.setClassName("android.widget.TextView");
                        accessibilityNodeInfoObtain.setEnabled(z11);
                        accessibilityNodeInfoObtain.setClickable(z11);
                        accessibilityNodeInfoObtain.setLongClickable(z11);
                        accessibilityNodeInfoObtain.addAction(16);
                        accessibilityNodeInfoObtain.addAction(32);
                        z10 = true;
                    }
                }
                return null;
            }
            if (i10 >= 1000) {
                int i29 = i10 - 1000;
                if (i29 < arrayList2.size()) {
                    e0 e0Var = (e0) arrayList2.get(i29);
                    if (!e0Var.f24232b) {
                        accessibilityNodeInfoObtain.setText(e0Var.h.k());
                        accessibilityNodeInfoObtain.setClassName("android.widget.Button");
                        accessibilityNodeInfoObtain.setEnabled(true);
                        accessibilityNodeInfoObtain.setClickable(true);
                        accessibilityNodeInfoObtain.addAction(16);
                        float f12 = e0Var.f24233c;
                        int i30 = s1Var.f25461o7;
                        int i31 = e0Var.d;
                        rect.set((int) (i30 * f12), i31, (int) ((f12 + e0Var.f24234e) * i30), e0Var.f24235f + i31);
                        rect.offset(s1Var.f25546u7.isOutOwner() ? (s1Var.getMeasuredWidth() - s1Var.getWidthForButtons()) - AndroidUtilities.dp(10.0f) : s1Var.f25501r8 + AndroidUtilities.dp(s1Var.f25347g8 ? 1.0f : 7.0f), s1Var.I8);
                        accessibilityNodeInfoObtain.setBoundsInParent(rect);
                        if (s1Var.f25423ld.get(i10) == null) {
                            s1Var.f25423ld.put(i10, new Rect(rect));
                        }
                        rect.offset(iArr[0], iArr[1]);
                        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                        z10 = true;
                    }
                }
                return null;
            }
            if (i10 >= 500) {
                int i32 = i10 - 500;
                if (i32 < arrayList.size()) {
                    q1 q1Var = (q1) arrayList.get(i32);
                    StringBuilder sb2 = new StringBuilder(q1Var.f25030p.getText());
                    if (s1Var.f25374i6) {
                        accessibilityNodeInfoObtain.setSelected(q1Var.f25023i);
                        sb2.append(", ");
                        sb2.append(q1Var.d);
                        sb2.append("%");
                        if (s1Var.K6 != null && s1Var.K6.quiz && (q1Var.f25023i || q1Var.f25026l)) {
                            sb2.append(", ");
                            if (q1Var.f25026l) {
                                str2 = "AccDescrQuizCorrectAnswer";
                                i12 = R.string.AccDescrQuizCorrectAnswer;
                            } else {
                                str2 = "AccDescrQuizIncorrectAnswer";
                                i12 = R.string.AccDescrQuizIncorrectAnswer;
                            }
                            sb2.append(LocaleController.getString(str2, i12));
                        }
                    } else {
                        accessibilityNodeInfoObtain.setClassName("android.widget.Button");
                    }
                    accessibilityNodeInfoObtain.setText(sb2);
                    accessibilityNodeInfoObtain.setEnabled(true);
                    accessibilityNodeInfoObtain.addAction(16);
                    int i33 = q1Var.f25018b + s1Var.Hc;
                    int iDp = s1Var.F8 - AndroidUtilities.dp(76.0f);
                    int i34 = q1Var.f25017a;
                    rect.set(i34, i33, iDp + i34, q1Var.f25019c + i33);
                    accessibilityNodeInfoObtain.setBoundsInParent(rect);
                    if (s1Var.f25423ld.get(i10) == null) {
                        s1Var.f25423ld.put(i10, new Rect(rect));
                    }
                    rect.offset(iArr[0], iArr[1]);
                    accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                    accessibilityNodeInfoObtain.setClickable(true);
                }
                return null;
            }
            if (i10 == 495) {
                accessibilityNodeInfoObtain.setClassName("android.widget.Button");
                accessibilityNodeInfoObtain.setEnabled(true);
                accessibilityNodeInfoObtain.setText(LocaleController.getString(R.string.AccDescrQuizExplanation));
                accessibilityNodeInfoObtain.addAction(16);
                rect.set(s1Var.Q6 - AndroidUtilities.dp(8.0f), s1Var.R6 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(32.0f) + s1Var.Q6, AndroidUtilities.dp(32.0f) + s1Var.R6);
                accessibilityNodeInfoObtain.setBoundsInParent(rect);
                if (s1Var.f25423ld.get(i10) == null || !((Rect) s1Var.f25423ld.get(i10)).equals(rect)) {
                    s1Var.f25423ld.put(i10, new Rect(rect));
                }
                rect.offset(iArr[0], iArr[1]);
                accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                accessibilityNodeInfoObtain.setClickable(true);
            } else if (i10 == 499) {
                accessibilityNodeInfoObtain.setClassName("android.widget.Button");
                accessibilityNodeInfoObtain.setEnabled(true);
                StaticLayout staticLayout2 = s1Var.K2;
                if (staticLayout2 != null) {
                    accessibilityNodeInfoObtain.setText(staticLayout2.getText());
                }
                accessibilityNodeInfoObtain.addAction(16);
                rectF2.round(rect);
                accessibilityNodeInfoObtain.setBoundsInParent(rect);
                if (s1Var.f25423ld.get(i10) == null || !((Rect) s1Var.f25423ld.get(i10)).equals(rect)) {
                    s1Var.f25423ld.put(i10, new Rect(rect));
                }
                rect.offset(iArr[0], iArr[1]);
                accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                accessibilityNodeInfoObtain.setClickable(true);
            } else if (i10 == 492) {
                accessibilityNodeInfoObtain.setClassName("android.widget.Button");
                accessibilityNodeInfoObtain.setEnabled(true);
                StaticLayout staticLayout3 = s1Var.F2;
                if (staticLayout3 != null) {
                    accessibilityNodeInfoObtain.setText(staticLayout3.getText());
                }
                accessibilityNodeInfoObtain.addAction(16);
                s1Var.U2.round(rect);
                if (s1Var.T2 != null && s1Var.T2.size() > 1) {
                    k1 k1Var = (k1) s1Var.T2.get(0);
                    if (!k1Var.f24558e.isEmpty()) {
                        rect.set(rect.left, rect.top, rect.right, (int) (rect.bottom - k1Var.f24558e.height()));
                    }
                }
                accessibilityNodeInfoObtain.setBoundsInParent(rect);
                if (s1Var.f25423ld.get(i10) == null || !((Rect) s1Var.f25423ld.get(i10)).equals(rect)) {
                    s1Var.f25423ld.put(i10, new Rect(rect));
                }
                rect.offset(iArr[0], iArr[1]);
                accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                accessibilityNodeInfoObtain.setClickable(true);
            } else if (i10 == 491 || i10 == 490 || i10 == 489) {
                int i35 = i10 == 491 ? 5 : i10 == 490 ? 31 : 30;
                for (int i36 = 0; i36 < s1Var.T2.size(); i36++) {
                    k1 k1Var2 = (k1) s1Var.T2.get(i36);
                    if (k1Var2.f24555a == i35) {
                        accessibilityNodeInfoObtain.setClassName("android.widget.Button");
                        accessibilityNodeInfoObtain.setEnabled(true);
                        StaticLayout staticLayout4 = k1Var2.d;
                        if (staticLayout4 != null) {
                            accessibilityNodeInfoObtain.setText(staticLayout4.getText());
                        }
                        accessibilityNodeInfoObtain.addAction(16);
                        k1Var2.f24558e.round(rect);
                        accessibilityNodeInfoObtain.setBoundsInParent(rect);
                        if (s1Var.f25423ld.get(i10) == null || !((Rect) s1Var.f25423ld.get(i10)).equals(rect)) {
                            s1Var.f25423ld.put(i10, new Rect(rect));
                        }
                        z10 = true;
                        rect.offset(iArr[0], iArr[1]);
                        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                        accessibilityNodeInfoObtain.setClickable(true);
                    }
                }
            } else if (i10 == 498) {
                accessibilityNodeInfoObtain.setClassName("android.widget.ImageButton");
                accessibilityNodeInfoObtain.setEnabled(true);
                if (s1.S(s1Var, s1Var.f25546u7)) {
                    accessibilityNodeInfoObtain.setContentDescription(LocaleController.getString("AccDescrOpenChat", R.string.AccDescrOpenChat));
                } else {
                    accessibilityNodeInfoObtain.setContentDescription(LocaleController.getString("ShareFile", R.string.ShareFile));
                }
                accessibilityNodeInfoObtain.addAction(16);
                float f13 = s1Var.Ca;
                rect.set((int) f13, (int) s1Var.Da, AndroidUtilities.dp(40.0f) + ((int) f13), AndroidUtilities.dp(32.0f) + ((int) s1Var.Da));
                accessibilityNodeInfoObtain.setBoundsInParent(rect);
                if (s1Var.f25423ld.get(i10) == null || !((Rect) s1Var.f25423ld.get(i10)).equals(rect)) {
                    s1Var.f25423ld.put(i10, new Rect(rect));
                }
                rect.offset(iArr[0], iArr[1]);
                accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                accessibilityNodeInfoObtain.setClickable(true);
            } else if (i10 == 497) {
                accessibilityNodeInfoObtain.setEnabled(true);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(LocaleController.getString("Reply", R.string.Reply));
                sb3.append(", ");
                StaticLayout staticLayout5 = s1Var.f25606y9;
                if (staticLayout5 != null) {
                    sb3.append(staticLayout5.getText());
                    sb3.append(", ");
                }
                StaticLayout staticLayout6 = s1Var.f25621z9;
                if (staticLayout6 != null) {
                    sb3.append(staticLayout6.getText());
                }
                accessibilityNodeInfoObtain.setContentDescription(sb3.toString());
                accessibilityNodeInfoObtain.addAction(16);
                int i37 = s1Var.C9;
                rect.set(i37, s1Var.D9, Math.max(s1Var.F9, s1Var.H9) + i37, s1Var.D9 + ((int) s1Var.E9));
                accessibilityNodeInfoObtain.setBoundsInParent(rect);
                if (s1Var.f25423ld.get(i10) == null || !((Rect) s1Var.f25423ld.get(i10)).equals(rect)) {
                    s1Var.f25423ld.put(i10, new Rect(rect));
                }
                rect.offset(iArr[0], iArr[1]);
                accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                accessibilityNodeInfoObtain.setClickable(true);
            } else if (i10 == 494) {
                accessibilityNodeInfoObtain.setEnabled(true);
                StringBuilder sb4 = new StringBuilder();
                if (s1Var.f25277bb[0] != null && s1Var.f25277bb[1] != null) {
                    int i38 = 0;
                    while (i38 < 2) {
                        sb4.append(s1Var.f25277bb[i38].getText());
                        sb4.append(i38 == 0 ? " " : "\n");
                        i38++;
                    }
                }
                accessibilityNodeInfoObtain.setContentDescription(sb4.toString());
                accessibilityNodeInfoObtain.addAction(16);
                float f14 = s1Var.f25320eb;
                float[] fArr = s1Var.f25364hb;
                int iMin = (int) Math.min(f14 - fArr[0], f14 - fArr[1]);
                rect.set(iMin, s1Var.f25336fb, s1Var.f25291cb + iMin, s1Var.f25350gb + s1Var.f25336fb);
                accessibilityNodeInfoObtain.setBoundsInParent(rect);
                if (s1Var.f25423ld.get(i10) == null || !((Rect) s1Var.f25423ld.get(i10)).equals(rect)) {
                    s1Var.f25423ld.put(i10, new Rect(rect));
                }
                rect.offset(iArr[0], iArr[1]);
                accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                accessibilityNodeInfoObtain.setClickable(true);
            } else if (i10 == 496) {
                accessibilityNodeInfoObtain.setClassName("android.widget.Button");
                accessibilityNodeInfoObtain.setEnabled(true);
                int repliesCount = s1Var.getRepliesCount();
                if (s1Var.f25546u7 == null || s1Var.f25546u7.shouldDrawWithoutBackground() || s1Var.f25546u7.isAnimatedEmoji()) {
                    shortNumber = (s1Var.Y7 || repliesCount <= 0) ? null : LocaleController.formatShortNumber(repliesCount, null);
                } else if (s1Var.Y7) {
                    shortNumber = LocaleController.getString("ViewInChat", R.string.ViewInChat);
                } else {
                    shortNumber = repliesCount == 0 ? LocaleController.getString("LeaveAComment", R.string.LeaveAComment) : LocaleController.formatPluralString("CommentsCount", repliesCount, new Object[0]);
                }
                if (shortNumber != null) {
                    accessibilityNodeInfoObtain.setText(shortNumber);
                }
                accessibilityNodeInfoObtain.addAction(16);
                rect.set(s1Var.f25348g9);
                accessibilityNodeInfoObtain.setBoundsInParent(rect);
                if (s1Var.f25423ld.get(i10) == null || !((Rect) s1Var.f25423ld.get(i10)).equals(rect)) {
                    s1Var.f25423ld.put(i10, new Rect(rect));
                }
                rect.offset(iArr[0], iArr[1]);
                accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                accessibilityNodeInfoObtain.setClickable(true);
            } else if (i10 == 493) {
                accessibilityNodeInfoObtain.setClassName("android.widget.Button");
                accessibilityNodeInfoObtain.setEnabled(true);
                if (s1Var.f25546u7.isVoiceTranscriptionOpen()) {
                    str = "AccActionCloseTranscription";
                    i11 = R.string.AccActionCloseTranscription;
                } else {
                    str = "AccActionOpenTranscription";
                    i11 = R.string.AccActionOpenTranscription;
                }
                accessibilityNodeInfoObtain.setText(LocaleController.getString(str, i11));
                accessibilityNodeInfoObtain.addAction(16);
                h1 h1Var = s1Var.I5;
                if (h1Var != null) {
                    float f15 = s1Var.J5;
                    rect.set((int) f15, (int) s1Var.K5, (int) (f15 + h1Var.x()), (int) (s1Var.K5 + s1Var.I5.i()));
                }
                accessibilityNodeInfoObtain.setBoundsInParent(rect);
                rect.offset(iArr[0], iArr[1]);
                accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                accessibilityNodeInfoObtain.setClickable(true);
            }
            z10 = true;
            accessibilityNodeInfoObtain.setFocusable(z10);
            accessibilityNodeInfoObtain.setVisibleToUser(z10);
            return accessibilityNodeInfoObtain;
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(s1Var);
        s1Var.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain2);
        boolean z13 = s1Var.f25546u7 != null && s1Var.f25546u7.isOut() && !s1Var.f25546u7.scheduled && s1Var.f25546u7.isUnread();
        boolean z14 = s1Var.f25546u7 != null && s1Var.f25546u7.isContentUnread();
        long j10 = s1Var.f25546u7 != null ? s1Var.f25546u7.loadedFileSize : 0L;
        if (s1Var.f25600y3 != null && s1Var.f25615z3 == z13 && s1Var.A3 == z14 && s1Var.B3 == j10) {
            accessibilityNodeInfoObtain2 = accessibilityNodeInfoObtain2;
            rectF2 = rectF2;
            arrayList = arrayList;
            arrayList2 = arrayList2;
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!s1Var.J7 || s1Var.Ub == null || s1Var.f25546u7.isOut()) {
                accessibilityNodeInfoObtain2 = accessibilityNodeInfoObtain2;
            } else {
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(s1Var.Ub));
                spannableStringBuilder.setSpan(new o1(this, s1Var.Ub), 0, spannableStringBuilder.length(), 33);
                CharSequence adminAccessibilityText = s1Var.getAdminAccessibilityText();
                if (!TextUtils.isEmpty(adminAccessibilityText)) {
                    if (s1Var.Ka) {
                        spannableStringBuilder.append(' ').append((CharSequence) LocaleController.formatString(s1Var.Ia ? R.string.AccDescrWithAdminTag : R.string.AccDescrWithMemberTag, adminAccessibilityText));
                    } else {
                        spannableStringBuilder.append((CharSequence) ", ").append(adminAccessibilityText);
                    }
                }
                spannableStringBuilder.append('\n');
            }
            if (s1Var.f25306db) {
                int i39 = 0;
                while (i39 < 2) {
                    if (s1Var.f25277bb[i39] != null && s1Var.f25277bb[i39].getText() != null) {
                        spannableStringBuilder.append(s1Var.f25277bb[i39].getText());
                        spannableStringBuilder.append(i39 == 0 ? " " : "\n");
                    }
                    i39++;
                }
            }
            if (s1Var.H1 != null && s1Var.G1 == 1) {
                String attachFileName = FileLoader.getAttachFileName(s1Var.H1);
                if (attachFileName.indexOf(46) != -1) {
                    spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.AccDescrDocumentType, attachFileName.substring(attachFileName.lastIndexOf(46) + 1).toUpperCase(Locale.ROOT)));
                }
            }
            if (s1Var.f25546u7.richLayout != null && !s1Var.f25546u7.richLayout.blocks.isEmpty()) {
                ArrayList<RichMessageLayout.RichBlock> arrayList5 = s1Var.f25546u7.richLayout.blocks;
                int size3 = arrayList5.size();
                int i40 = 0;
                while (i40 < size3) {
                    RichMessageLayout.RichBlock richBlock = arrayList5.get(i40);
                    i40++;
                    RichMessageLayout.RichBlock richBlock2 = richBlock;
                    if (richBlock2.isVisible()) {
                        int length3 = spannableStringBuilder.length();
                        ArrayList<RichMessageLayout.RichBlock> arrayList6 = arrayList5;
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        richBlock2.appendAccessibilityText(spannableStringBuilder2);
                        int i41 = size3;
                        CharSequence accessibilityLabel = richBlock2.getAccessibilityLabel();
                        CharSequence accessibilityListMarker = richBlock2.getAccessibilityListMarker();
                        if (!TextUtils.isEmpty(accessibilityListMarker)) {
                            spannableStringBuilder.append(accessibilityListMarker);
                            if (!TextUtils.isEmpty(accessibilityLabel) || spannableStringBuilder2.length() > 0) {
                                spannableStringBuilder.append(' ');
                            }
                        }
                        if (!TextUtils.isEmpty(accessibilityLabel)) {
                            spannableStringBuilder.append(accessibilityLabel);
                            if (spannableStringBuilder2.length() > 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                        }
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        if (spannableStringBuilder.length() > length3 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                            spannableStringBuilder.append('\n');
                        }
                        arrayList5 = arrayList6;
                        size3 = i41;
                    }
                }
            } else if (!TextUtils.isEmpty(s1Var.f25546u7.messageText)) {
                CharSequence charSequence = s1Var.f25546u7.messageText;
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(0, spanned.length(), CodeHighlighting.Span.class);
                    if (spanArr != null && spanArr.length > 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(charSequence);
                        Arrays.sort(spanArr, new n1(spanned, 0));
                        int length4 = spanArr.length;
                        int i42 = 0;
                        while (i42 < length4) {
                            int i43 = length4;
                            CodeHighlighting.Span span = spanArr[i42];
                            CodeHighlighting.Span[] spanArr2 = spanArr;
                            int spanStart = spanned.getSpanStart(span);
                            if (spanStart < 0) {
                                i42 = i42;
                            } else {
                                spannableStringBuilder3.insert(spanStart, (CharSequence) (((Object) (TextUtils.isEmpty(span.lng) ? LocaleController.getString(R.string.AccDescrCodeBlock) : LocaleController.formatString(R.string.AccDescrCodeBlockLanguage, MessageObject.TextLayoutBlock.capitalizeLanguage(span.lng)))) + ". "));
                            }
                            i42++;
                            length4 = i43;
                            spanArr = spanArr2;
                            spanned = spanned;
                        }
                        charSequence = spannableStringBuilder3;
                    }
                }
                spannableStringBuilder.append(charSequence);
            }
            if (s1Var.H1 != null && ((s1Var.G1 == 1 || s1Var.G1 == 2 || s1Var.G1 == 4) && s1Var.K4 == 1 && s1Var.f25543u4 != null)) {
                spannableStringBuilder.append((CharSequence) "\n");
                boolean zIsSending = s1Var.f25546u7.isSending();
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(zIsSending ? "AccDescrUploadProgress" : "AccDescrDownloadProgress", zIsSending ? R.string.AccDescrUploadProgress : R.string.AccDescrDownloadProgress, AndroidUtilities.formatFileSize(s1Var.f25546u7.loadedFileSize), AndroidUtilities.formatFileSize(s1Var.f25540u1)));
            }
            if (s1Var.f25546u7.isMusic()) {
                spannableStringBuilder.append((CharSequence) "\n");
                spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, s1Var.f25546u7.getMusicAuthor(), s1Var.f25546u7.getMusicTitle()));
                spannableStringBuilder.append((CharSequence) ", ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatDuration((int) s1Var.f25546u7.getDuration()));
            } else if (s1Var.f25546u7.isVoice() || s1Var.f25437md) {
                spannableStringBuilder.append((CharSequence) ", ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatDuration((int) s1Var.f25546u7.getDuration()));
                spannableStringBuilder.append((CharSequence) ", ");
                if (s1Var.f25546u7.isContentUnread()) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgNotPlayed", R.string.AccDescrMsgNotPlayed));
                } else {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgPlayed", R.string.AccDescrMsgPlayed));
                }
            }
            if (s1Var.K6 != null) {
                spannableStringBuilder.append((CharSequence) ", ");
                spannableStringBuilder.append((CharSequence) s1Var.K6.question.text);
                spannableStringBuilder.append((CharSequence) ", ");
                if (s1Var.p6) {
                    string = LocaleController.getString("FinalResults", R.string.FinalResults);
                } else if (s1Var.K6.quiz) {
                    string = s1Var.K6.public_voters ? LocaleController.getString("QuizPoll", R.string.QuizPoll) : LocaleController.getString("AnonymousQuizPoll", R.string.AnonymousQuizPoll);
                } else {
                    string = s1Var.K6.public_voters ? LocaleController.getString("PublicPoll", R.string.PublicPoll) : LocaleController.getString("AnonymousPoll", R.string.AnonymousPoll);
                }
                spannableStringBuilder.append((CharSequence) string);
            }
            if (s1Var.H1 != null) {
                if (s1Var.G1 == 4) {
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) LocaleController.formatDuration((int) s1Var.f25546u7.getDuration()));
                }
                if (s1Var.K4 == 0 || s1Var.G1 == 1) {
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.formatFileSize(s1Var.H1.size));
                }
            }
            if (s1Var.f25546u7.isVoiceTranscriptionOpen()) {
                spannableStringBuilder.append((CharSequence) "\n");
                spannableStringBuilder.append(s1Var.f25546u7.getVoiceTranscription());
            } else if (MessageObject.getMedia(s1Var.f25546u7.messageOwner) != null && !TextUtils.isEmpty(s1Var.f25546u7.caption)) {
                spannableStringBuilder.append((CharSequence) "\n");
                spannableStringBuilder.append(s1Var.f25546u7.caption);
            }
            if (s1Var.f25546u7.isOut()) {
                if (s1Var.f25546u7.isSent()) {
                    spannableStringBuilder.append((CharSequence) "\n");
                    if (s1Var.f25546u7.scheduled) {
                        spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrScheduledDate", R.string.AccDescrScheduledDate, s1Var.pb));
                        str3 = r14;
                    } else {
                        int i44 = R.string.AccDescrSentDate;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(LocaleController.getString("TodayAt", R.string.TodayAt));
                        str3 = r14;
                        sb5.append(str3);
                        sb5.append((Object) s1Var.pb);
                        spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrSentDate", i44, sb5.toString()));
                        spannableStringBuilder.append((CharSequence) ", ");
                        if (s1Var.f25546u7.isUnread()) {
                            str4 = "AccDescrMsgUnread";
                            i15 = R.string.AccDescrMsgUnread;
                        } else {
                            str4 = "AccDescrMsgRead";
                            i15 = R.string.AccDescrMsgRead;
                        }
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(str4, i15));
                    }
                } else {
                    str3 = r14;
                    if (s1Var.f25546u7.isSending()) {
                        spannableStringBuilder.append((CharSequence) "\n");
                        spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgSending", R.string.AccDescrMsgSending));
                        RadialProgress2 radialProgress2 = s1Var.K0;
                        float f16 = (radialProgress2.f26466c ? radialProgress2.f26471j : radialProgress2.f26470i).f28314w;
                        if (f16 > 0.0f) {
                            spannableStringBuilder.append((CharSequence) Integer.toString(Math.round(f16 * 100.0f))).append((CharSequence) "%");
                        }
                    } else if (s1Var.f25546u7.isSendError()) {
                        spannableStringBuilder.append((CharSequence) "\n");
                        spannableStringBuilder.append((CharSequence) LocaleController.getString("AccDescrMsgSendingError", R.string.AccDescrMsgSendingError));
                    }
                }
                i13 = 0;
            } else {
                str3 = r14;
                spannableStringBuilder.append((CharSequence) "\n");
                i13 = 0;
                spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, LocaleController.getString("TodayAt", R.string.TodayAt) + str3 + ((Object) s1Var.pb)));
            }
            if (s1Var.getRepliesCount() > 0 && !s1Var.P2()) {
                spannableStringBuilder.append((CharSequence) "\n");
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfReplies", s1Var.getRepliesCount(), new Object[i13]));
            }
            if (s1Var.f25546u7.messageOwner.reactions != null && s1Var.f25546u7.messageOwner.reactions.results != null) {
                String firstName = "";
                if (s1Var.f25546u7.messageOwner.reactions.results.size() == 1) {
                    TLRPC.ReactionCount reactionCount = s1Var.f25546u7.messageOwner.reactions.results.get(0);
                    TLRPC.Reaction reaction = reactionCount.reaction;
                    String str5 = reaction instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction).emoticon : "";
                    int i45 = reactionCount.count;
                    if (i45 == 1) {
                        spannableStringBuilder.append((CharSequence) "\n");
                        if (s1Var.f25546u7.messageOwner.reactions.recent_reactions == null || s1Var.f25546u7.messageOwner.reactions.recent_reactions.size() != 1 || (messagePeerReaction = s1Var.f25546u7.messageOwner.reactions.recent_reactions.get(0)) == null) {
                            zIsUserSelf = false;
                        } else {
                            TLRPC.User user = MessagesController.getInstance(s1Var.E7).getUser(Long.valueOf(MessageObject.getPeerId(messagePeerReaction.peer_id)));
                            zIsUserSelf = UserObject.isUserSelf(user);
                            if (user != null) {
                                firstName = UserObject.getFirstName(user);
                            }
                        }
                        if (zIsUserSelf) {
                            spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrYouReactedWith", R.string.AccDescrYouReactedWith, str5));
                        } else {
                            spannableStringBuilder.append((CharSequence) LocaleController.formatString("AccDescrReactedWith", R.string.AccDescrReactedWith, firstName, str5));
                        }
                    } else if (i45 > 1) {
                        spannableStringBuilder.append((CharSequence) "\n");
                        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", reactionCount.count, str5));
                    }
                } else {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString("Reactions", R.string.Reactions)).append((CharSequence) ": ");
                    int size4 = s1Var.f25546u7.messageOwner.reactions.results.size();
                    int i46 = 0;
                    while (i46 < size4) {
                        TLRPC.ReactionCount reactionCount2 = s1Var.f25546u7.messageOwner.reactions.results.get(i46);
                        TLRPC.Reaction reaction2 = reactionCount2.reaction;
                        int i47 = i46;
                        spannableStringBuilder.append((CharSequence) (reaction2 instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction2).emoticon : "")).append((CharSequence) str3).append((CharSequence) (reactionCount2.count + ""));
                        i46 = i47 + 1;
                        if (i46 < size4) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                    }
                    spannableStringBuilder.append((CharSequence) "\n");
                }
            }
            if ((s1Var.f25546u7.messageOwner.flags & 1024) != 0) {
                spannableStringBuilder.append((CharSequence) "\n");
                i14 = 0;
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("AccDescrNumberOfViews", s1Var.f25546u7.messageOwner.views, new Object[0]));
            } else {
                i14 = 0;
            }
            spannableStringBuilder.append((CharSequence) "\n");
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(i14, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart2 = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new i(2, this, characterStyle), spanStart2, spanEnd, 33);
            }
            s1Var.f25600y3 = spannableStringBuilder;
            s1Var.f25615z3 = z13;
            s1Var.A3 = z14;
            s1Var.B3 = j10;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo = accessibilityNodeInfoObtain2;
            accessibilityNodeInfo.setContentDescription(s1Var.f25600y3.toString());
        } else {
            accessibilityNodeInfo = accessibilityNodeInfoObtain2;
            accessibilityNodeInfo.setText(s1Var.f25600y3);
        }
        accessibilityNodeInfo.setEnabled(true);
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), 1, 0, 1, false));
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_msg_options, LocaleController.getString("AccActionMessageOptions", R.string.AccActionMessageOptions)));
        int iconForCurrentState = s1Var.getIconForCurrentState();
        if (iconForCurrentState == 0) {
            string2 = LocaleController.getString("AccActionPlay", R.string.AccActionPlay);
        } else if (iconForCurrentState == 1) {
            string2 = LocaleController.getString("AccActionPause", R.string.AccActionPause);
        } else if (iconForCurrentState == 2) {
            string2 = LocaleController.getString("AccActionDownload", R.string.AccActionDownload);
        } else if (iconForCurrentState == 3) {
            string2 = LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload);
        } else if (iconForCurrentState != 5) {
            string2 = s1Var.f25546u7.type == 16 ? LocaleController.getString("CallAgain", R.string.CallAgain) : null;
        } else {
            string2 = LocaleController.getString("AccActionOpenFile", R.string.AccActionOpenFile);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string2));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccActionEnterSelectionMode", R.string.AccActionEnterSelectionMode)));
        if (s1Var.getMiniIconForCurrentState() == 2) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_small_button, LocaleController.getString("AccActionDownload", R.string.AccActionDownload)));
        }
        if (s1Var.f25549ua || s1Var.f25305da) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_summarize, LocaleController.getString("SummaryTitle", R.string.SummaryTitle)));
        }
        if (s1Var.f25546u7.textLayoutBlocks != null) {
            ArrayList<MessageObject.TextLayoutBlock> arrayList7 = s1Var.f25546u7.textLayoutBlocks;
            int size5 = arrayList7.size();
            int i48 = 0;
            while (i48 < size5) {
                MessageObject.TextLayoutBlock textLayoutBlock5 = arrayList7.get(i48);
                i48++;
                if (textLayoutBlock5.hasCodeCopyButton) {
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_copy_code, LocaleController.getString("CopyCode", R.string.CopyCode)));
                    break;
                }
            }
        }
        if ((s1Var.f25546u7.isVoice() || s1Var.f25546u7.isRoundVideo() || s1Var.f25546u7.isMusic()) && MediaController.getInstance().isPlayingMessage(s1Var.f25546u7)) {
            s1Var.E5.f(accessibilityNodeInfo);
        }
        if (s1Var.H5 && s1Var.I5 != null) {
            accessibilityNodeInfo.addChild(s1Var, 493);
        }
        if (Build.VERSION.SDK_INT < 24) {
            if (s1Var.J7 && s1Var.Ub != null && !s1Var.f25546u7.isOut()) {
                accessibilityNodeInfo.addChild(s1Var, 5000);
            }
            if (s1Var.f25546u7.messageText instanceof Spannable) {
                Spannable spannable3 = (Spannable) s1Var.f25546u7.messageText;
                int i49 = 0;
                for (CharacterStyle characterStyle2 : (CharacterStyle[]) spannable3.getSpans(0, spannable3.length(), ClickableSpan.class)) {
                    accessibilityNodeInfo.addChild(s1Var, i49 + 2000);
                    i49++;
                }
            }
            if ((s1Var.f25546u7.caption instanceof Spannable) && s1Var.Y3 != null) {
                Spannable spannable4 = (Spannable) s1Var.f25546u7.caption;
                int i50 = 0;
                for (CharacterStyle characterStyle3 : (CharacterStyle[]) spannable4.getSpans(0, spannable4.length(), ClickableSpan.class)) {
                    accessibilityNodeInfo.addChild(s1Var, i50 + 3000);
                    i50++;
                }
            }
        }
        int size6 = arrayList2.size();
        int i51 = 0;
        int i52 = 0;
        while (i52 < size6) {
            Object obj = arrayList2.get(i52);
            i52++;
            accessibilityNodeInfo.addChild(s1Var, i51 + 1000);
            i51++;
        }
        if (s1Var.T6 && s1Var.Q6 != -1 && s1Var.f25546u7.isPoll()) {
            accessibilityNodeInfo.addChild(s1Var, 495);
        }
        int size7 = arrayList.size();
        int i53 = 0;
        int i54 = 0;
        while (i54 < size7) {
            Object obj2 = arrayList.get(i54);
            i54++;
            accessibilityNodeInfo.addChild(s1Var, i53 + 500);
            i53++;
        }
        if (s1Var.N2 && !rectF2.isEmpty()) {
            accessibilityNodeInfo.addChild(s1Var, 499);
        }
        if (s1Var.O2 && (rectF = s1Var.U2) != null && !rectF.isEmpty()) {
            accessibilityNodeInfo.addChild(s1Var, 492);
            if (s1Var.T2 != null && s1Var.T2.size() > 1) {
                ArrayList arrayList8 = s1Var.T2;
                int size8 = arrayList8.size();
                int i55 = 0;
                while (i55 < size8) {
                    Object obj3 = arrayList8.get(i55);
                    i55++;
                    k1 k1Var3 = (k1) obj3;
                    if (s1Var.Q2 && k1Var3.f24555a == 5 && !k1Var3.f24558e.isEmpty()) {
                        accessibilityNodeInfo.addChild(s1Var, 491);
                    }
                    if (s1Var.R2 && k1Var3.f24555a == 31 && !k1Var3.f24558e.isEmpty()) {
                        accessibilityNodeInfo.addChild(s1Var, 490);
                    }
                    if (s1Var.P2 && k1Var3.f24555a == 30 && !k1Var3.f24558e.isEmpty()) {
                        accessibilityNodeInfo.addChild(s1Var, 489);
                    }
                }
            }
        }
        if (s1Var.V8 != null) {
            accessibilityNodeInfo.addChild(s1Var, 496);
        }
        int i56 = s1Var.f25487qa;
        if (i56 == 1 || i56 == 2) {
            accessibilityNodeInfo.addChild(s1Var, 498);
        }
        if (s1Var.f25606y9 != null) {
            accessibilityNodeInfo.addChild(s1Var, 497);
        }
        if (s1Var.f25546u7 != null && s1Var.f25546u7.richLayout != null) {
            RichMessageLayout richMessageLayout = s1Var.f25546u7.richLayout;
            int i57 = 0;
            for (int i58 = 0; i58 < richMessageLayout.blocks.size(); i58++) {
                RichMessageLayout.RichBlock richBlock3 = richMessageLayout.blocks.get(i58);
                if (richBlock3.isVisible()) {
                    int accessibilityElementCount = richBlock3.getAccessibilityElementCount();
                    for (int i59 = 0; i59 < accessibilityElementCount; i59++) {
                        accessibilityNodeInfo.addChild(s1Var, i57 + 6000 + i59);
                    }
                    i57 += accessibilityElementCount;
                }
            }
        }
        if (s1Var.f25277bb[0] != null && s1Var.f25277bb[1] != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_open_forwarded_origin, LocaleController.getString("AccActionOpenForwardedOrigin", R.string.AccActionOpenForwardedOrigin)));
        }
        if (!s1Var.f25326f1 && s1Var.getBackground() == null) {
            return accessibilityNodeInfo;
        }
        accessibilityNodeInfo.setSelected(true);
        return accessibilityNodeInfo;
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        j1 j1Var;
        h1 h1Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        s1 s1Var = this.d;
        ArrayList arrayList = s1Var.U5;
        ArrayList arrayList2 = s1Var.f25405k7;
        if (i10 == -1) {
            s1Var.performAccessibilityAction(i11, bundle);
            return true;
        }
        if (i11 == 64) {
            s1Var.H3(i10, 32768, null);
            return true;
        }
        if (i11 == 16) {
            if (i10 == 5000) {
                j1 j1Var2 = s1Var.Fc;
                if (j1Var2 != null) {
                    j1Var2.v0(s1Var, s1Var.Ub, 0.0f, 0.0f);
                    return true;
                }
            } else if (i10 >= 6000) {
                int[] iArr = {0};
                RichMessageLayout.RichBlock richBlockB = b(i10, iArr);
                if (richBlockB != null && richBlockB.onAccessibilityElementClick(iArr[0], s1Var)) {
                    s1Var.H3(i10, 1, null);
                    AndroidUtilities.makeAccessibilityAnnouncement(richBlockB.getAccessibilityElementStateDescription(iArr[0]));
                    return true;
                }
            } else if (i10 >= 3000) {
                ClickableSpan clickableSpanA = a(i10, true);
                if (clickableSpanA != null) {
                    s1Var.Fc.R0(s1Var, clickableSpanA, false);
                    s1Var.H3(i10, 1, null);
                    return true;
                }
            } else {
                if (i10 < 2000) {
                    if (i10 >= 1000) {
                        int i12 = i10 - 1000;
                        if (i12 < arrayList2.size()) {
                            e0 e0Var = (e0) arrayList2.get(i12);
                            j1 j1Var3 = s1Var.Fc;
                            if (j1Var3 != null && !e0Var.f24241m) {
                                BotInlineKeyboard.ButtonCustom buttonCustom = e0Var.f24238j;
                                if (buttonCustom != null) {
                                    j1Var3.L(s1Var, buttonCustom);
                                } else {
                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = e0Var.f24237i;
                                    if (keyboardInlineButton != null) {
                                        j1Var3.e1(s1Var, keyboardInlineButton);
                                    }
                                }
                            }
                            s1Var.H3(i10, 1, null);
                            return true;
                        }
                    } else if (i10 >= 500) {
                        int i13 = i10 - 500;
                        if (i13 < arrayList.size()) {
                            q1 q1Var = (q1) arrayList.get(i13);
                            if (s1Var.Fc != null) {
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(q1Var.f25033s);
                                s1Var.Fc.j(s1Var, arrayList3, -1, 0, 0);
                            }
                            s1Var.H3(i10, 1, null);
                            return true;
                        }
                    } else {
                        if (i10 == 495) {
                            s1Var.w1();
                            return true;
                        }
                        if (i10 == 499) {
                            j1 j1Var4 = s1Var.Fc;
                            if (j1Var4 != null) {
                                j1Var4.O0(s1Var.X2, s1Var);
                                return true;
                            }
                        } else if (i10 == 492) {
                            j1 j1Var5 = s1Var.Fc;
                            if (j1Var5 != null) {
                                j1Var5.O0(5, s1Var);
                                return true;
                            }
                        } else if (i10 == 491) {
                            j1 j1Var6 = s1Var.Fc;
                            if (j1Var6 != null) {
                                j1Var6.O0(5, s1Var);
                                return true;
                            }
                        } else if (i10 == 490) {
                            j1 j1Var7 = s1Var.Fc;
                            if (j1Var7 != null) {
                                j1Var7.O0(31, s1Var);
                                return true;
                            }
                        } else if (i10 == 489) {
                            j1 j1Var8 = s1Var.Fc;
                            if (j1Var8 != null) {
                                j1Var8.O0(30, s1Var);
                                return true;
                            }
                        } else if (i10 == 498) {
                            j1 j1Var9 = s1Var.Fc;
                            if (j1Var9 != null) {
                                j1Var9.t(s1Var);
                                return true;
                            }
                        } else if (i10 == 497) {
                            if (s1Var.Fc != null && ((!s1Var.S7 || s1Var.Q7 || s1Var.f25546u7.getReplyTopMsgId() != 0) && (s1Var.f25546u7.hasValidReplyMessageObject() || s1Var.f25548u9 || ((message = s1Var.f25546u7.messageOwner) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.reply_from != null)))) {
                                s1Var.Fc.R1(s1Var, s1Var.f25546u7.getReplyMsgId(), 0.0f, 0.0f, false);
                                return true;
                            }
                        } else if (i10 == 494) {
                            j1 j1Var10 = s1Var.Fc;
                            if (j1Var10 != null) {
                                TLRPC.Chat chat = s1Var.fc;
                                if (chat != null) {
                                    j1Var10.Y(s1Var, chat, s1Var.f25546u7.messageOwner.fwd_from.channel_post, s1Var.f25282c1, s1Var.f25296d1, false);
                                    return true;
                                }
                                TLRPC.User user = s1Var.f25307dc;
                                if (user != null) {
                                    j1Var10.v0(s1Var, user, s1Var.f25282c1, s1Var.f25296d1);
                                    return true;
                                }
                                if (s1Var.gc != null) {
                                    j1Var10.p(s1Var);
                                    return true;
                                }
                            }
                        } else if (i10 == 496) {
                            j1 j1Var11 = s1Var.Fc;
                            if (j1Var11 != null) {
                                if (s1Var.Y7) {
                                    j1Var11.t(s1Var);
                                    return true;
                                }
                                j1Var11.x(s1Var);
                                return true;
                            }
                        } else if (i10 == 493 && (h1Var = s1Var.I5) != null) {
                            h1Var.m();
                            return true;
                        }
                    }
                    return false;
                }
                ClickableSpan clickableSpanA2 = a(i10, false);
                if (clickableSpanA2 != null) {
                    s1Var.Fc.R0(s1Var, clickableSpanA2, false);
                    s1Var.H3(i10, 1, null);
                    return true;
                }
            }
        } else if (i11 == 32) {
            ClickableSpan clickableSpanA3 = a(i10, i10 >= 3000);
            if (clickableSpanA3 != null && (j1Var = s1Var.Fc) != null) {
                j1Var.R0(s1Var, clickableSpanA3, true);
                s1Var.H3(i10, 2, null);
            }
        }
        return true;
    }
}
