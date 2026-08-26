package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

public final class StarGiftSheet$Roller$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final StarGiftSheet.Roller f$0;

    public StarGiftSheet$Roller$$ExternalSyntheticLambda0(StarGiftSheet.Roller roller, int i) {
        this.$r8$classId = i;
        this.f$0 = roller;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invalidate();
                break;
            case 1:
                StarGiftSheet.Roller roller = this.f$0;
                if (!roller.drawing) {
                    roller.posted = false;
                    if (roller.rolling) {
                        roller.drawing = true;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        float fMin = Math.min((jCurrentTimeMillis - roller.lastFrameTime) / 1000.0f, 0.25f);
                        float f = roller.realTime + fMin;
                        roller.realTime = f;
                        float fStep = roller.backdropRoller.step(fMin, f > AndroidUtilities.lerp(0.1f, 1.0f, roller.durationT));
                        float fStep2 = roller.backdropRoller2.step(fMin, roller.realTime > AndroidUtilities.lerp(0.1f, 1.0f, roller.durationT));
                        float fStep3 = roller.symbolRoller.step(fMin, roller.backdropRoller.isAlmostFinished(0.5f));
                        float fStep4 = roller.modelRoller.step(fMin, roller.backdropRoller.isAlmostFinished(0.5f) && roller.symbolRoller.isAlmostFinished(0.5f));
                        roller.lastFrameTime = jCurrentTimeMillis;
                        if (roller.backdropRoller.isFinished() && roller.symbolRoller.isFinished() && roller.modelRoller.isFinished() && !roller.sentDone) {
                            roller.sentDone = true;
                            AndroidUtilities.runOnUIThread(new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller, 2));
                        }
                        if (roller.backdropRoller.isFinished() && roller.symbolRoller.isFinished() && roller.modelRoller.isAlmostFinished(0.25f) && !roller.sentDone2) {
                            roller.sentDone2 = true;
                            AndroidUtilities.runOnUIThread(new StarGiftSheet$Roller$$ExternalSyntheticLambda0(roller, 3));
                        }
                        StarGiftSheet.TextViewRoll textViewRoll = roller.modelText;
                        if (textViewRoll != null) {
                            StarGiftSheet.Roller.AttrRoller attrRoller = roller.modelRoller;
                            StarGiftSheet.Roller.Attr attr = attrRoller.prev;
                            float f2 = attrRoller.currentT - fStep4;
                            float f3 = f2 - 1.0f;
                            StarGiftSheet.Roller.Attr attr2 = attrRoller.finish;
                            boolean z = attr == attr2;
                            StarGiftSheet.Roller.Attr attr3 = attrRoller.current;
                            boolean z2 = attr3 == attr2;
                            StarGiftSheet.Roller.Attr attr4 = attrRoller.next;
                            textViewRoll.update(attr, f3, z, attr3, f2, z2, attr4, f2 + 1.0f, attr4 == attr2);
                        }
                        StarGiftSheet.TextViewRoll textViewRoll2 = roller.patternText;
                        if (textViewRoll2 != null) {
                            StarGiftSheet.Roller.AttrRoller attrRoller2 = roller.symbolRoller;
                            StarGiftSheet.Roller.Attr attr5 = attrRoller2.prev;
                            float f4 = attrRoller2.currentT - fStep3;
                            float f5 = f4 - 1.0f;
                            StarGiftSheet.Roller.Attr attr6 = attrRoller2.finish;
                            boolean z3 = attr5 == attr6;
                            StarGiftSheet.Roller.Attr attr7 = attrRoller2.current;
                            boolean z4 = attr7 == attr6;
                            StarGiftSheet.Roller.Attr attr8 = attrRoller2.next;
                            textViewRoll2.update(attr5, f5, z3, attr7, f4, z4, attr8, f4 + 1.0f, attr8 == attr6);
                        }
                        StarGiftSheet.TextViewRoll textViewRoll3 = roller.backdropText;
                        if (textViewRoll3 != null) {
                            StarGiftSheet.Roller.AttrRoller attrRoller3 = roller.backdropRoller2;
                            StarGiftSheet.Roller.Attr attr9 = attrRoller3.prev;
                            float f6 = attrRoller3.currentT - fStep2;
                            float f7 = f6 - 1.0f;
                            StarGiftSheet.Roller.Attr attr10 = attrRoller3.finish;
                            boolean z5 = attr9 == attr10;
                            StarGiftSheet.Roller.Attr attr11 = attrRoller3.current;
                            boolean z6 = attr11 == attr10;
                            StarGiftSheet.Roller.Attr attr12 = attrRoller3.next;
                            textViewRoll3.update(attr9, f7, z5, attr11, f6, z6, attr12, f6 + 1.0f, attr12 == attr10);
                        }
                        TL_stars.starGiftAttributePattern stargiftattributepattern = ((StarGiftSheet.Roller.Symbol) roller.symbolRoller.current).attr;
                        StarGiftSheet.TopView topView = roller.topView;
                        topView.setPattern(0, stargiftattributepattern, true);
                        StarGiftSheet.Roller.AttrRoller attrRoller4 = roller.modelRoller;
                        StarGiftSheet.Roller.Attr attr13 = attrRoller4.prev;
                        StarGiftSheet.Roller.Sticker sticker = (StarGiftSheet.Roller.Sticker) attr13;
                        float f8 = attrRoller4.currentT - fStep4;
                        float f9 = f8 - 1.0f;
                        StarGiftSheet.Roller.Attr attr14 = attrRoller4.finish;
                        boolean z7 = attr13 == attr14;
                        StarGiftSheet.Roller.Attr attr15 = attrRoller4.current;
                        StarGiftSheet.Roller.Sticker sticker2 = (StarGiftSheet.Roller.Sticker) attr15;
                        boolean z8 = attr15 == attr14;
                        StarGiftSheet.Roller.Attr attr16 = attrRoller4.next;
                        StarGiftSheet.Roller.Sticker sticker3 = (StarGiftSheet.Roller.Sticker) attr16;
                        float f10 = f8 + 1.0f;
                        boolean z9 = attr16 == attr14;
                        StarGiftSheet.Roller.AttrRoller attrRoller5 = roller.backdropRoller;
                        StarGiftSheet.Roller.Background background = (StarGiftSheet.Roller.Background) attrRoller5.prev;
                        float f11 = attrRoller5.currentT - fStep;
                        StarGiftSheet.Roller.Background background2 = (StarGiftSheet.Roller.Background) attrRoller5.current;
                        StarGiftSheet.Roller.Background background3 = (StarGiftSheet.Roller.Background) attrRoller5.next;
                        StarGiftSheet.StickersRollView stickersRollView = topView.imagesRollView;
                        stickersRollView.a = sticker;
                        stickersRollView.b = sticker2;
                        stickersRollView.c = sticker3;
                        stickersRollView.aT = f9;
                        stickersRollView.bT = f8;
                        stickersRollView.cT = f10;
                        stickersRollView.aIsFinish = z7;
                        stickersRollView.bIsFinish = z8;
                        stickersRollView.cIsFinish = z9;
                        stickersRollView.bgA = background;
                        stickersRollView.bgB = background2;
                        stickersRollView.bgC = background3;
                        stickersRollView.bgAT = f11 - 1.0f;
                        stickersRollView.bgBT = f11;
                        stickersRollView.bgCT = f11 + 1.0f;
                        stickersRollView.invalidate();
                        roller.drawing = false;
                        roller.invalidate();
                        break;
                    }
                }
                break;
            case 2:
                StarGiftSheet.Roller roller2 = this.f$0;
                roller2.rolling = false;
                roller2.topView.imagesRollView.resetDrawing();
                StarGiftSheet$$ExternalSyntheticLambda4 starGiftSheet$$ExternalSyntheticLambda4 = roller2.whenDone;
                if (starGiftSheet$$ExternalSyntheticLambda4 != null) {
                    starGiftSheet$$ExternalSyntheticLambda4.run();
                }
                break;
            default:
                StarGiftSheet$$ExternalSyntheticLambda4 starGiftSheet$$ExternalSyntheticLambda5 = this.f$0.whenDone2;
                if (starGiftSheet$$ExternalSyntheticLambda5 != null) {
                    starGiftSheet$$ExternalSyntheticLambda5.run();
                }
                break;
        }
    }
}
